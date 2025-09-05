package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC001_AccountRegistrationTest extends BaseClass{



	@Test
	public void verify_Account_Registration() {

		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();

		AccountRegistrationPage arp = new AccountRegistrationPage(driver);
		arp.setFirstName(randomAlphabet().toUpperCase());
		arp.setLastName(randomAlphabet().toUpperCase());
		arp.setPassword("admin");
		arp.setEmail(randomAlphabet().toUpperCase()+"@gmail.com");
		arp.setPrivacyPolicy();
	arp.clickContinue();

	}
	
	@SuppressWarnings("deprecation")
	public String randomAlphabet()
	{
		
		return RandomStringUtils.randomAlphabetic(5);
		
	}

}