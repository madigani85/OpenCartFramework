package testCases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC001_AccountRegistrationTest extends BaseClass {

	@Test
	public void verify_Account_Registration() {

		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		AccountRegistrationPage arp = new AccountRegistrationPage(driver);
		arp.setFirstName(randomAlphabet().toUpperCase());
		arp.setLastName(randomAlphabet().toUpperCase());
		arp.setPassword("admin");
		arp.setPasswordConfirm("admin");
		arp.setEmail(randomAlphabet().toUpperCase() + "@gmail.com");
		arp.setTelephone(randomNumeric());
		arp.setPrivacyPolicy();
		arp.clickContinue();

		Assert.assertEquals("Your Account Has Been Created!", arp.validateAccountCreation());
	

	}

	@SuppressWarnings("deprecation")
	public String randomAlphabet() {

		return RandomStringUtils.randomAlphabetic(5);

	}

	public String randomNumeric() {

		return RandomStringUtils.randomNumeric(10);

	}

	public String randomAlphanumeric() {

		return RandomStringUtils.randomAlphanumeric(5);

	}

}