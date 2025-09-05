package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstName;

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLastName;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement chkdPolicy;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement btnContinue;

	public void setFirstName(String firstName) {
		txtFirstName.sendKeys(firstName);

	}

	public void setLastName(String lastName) {
		txtLastName.sendKeys(lastName);

	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);

	}

	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}

	public void setPrivacyPolicy() {

		chkdPolicy.click();
	}

	public void clickContinue() {
		btnContinue.click();

	}

}
