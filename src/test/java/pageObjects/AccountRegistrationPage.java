package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtTelephone;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtPasswordConfirm;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement chkdPolicy;

	@FindBy(xpath = "(//input[@value='Continue'])[1]")
	WebElement btnContinue;
	
	
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement accountCreationText;
	
	
	
	

	public void setFirstName(String firstName) {
		txtFirstName.sendKeys(firstName);

	}

	public void setLastName(String lastName) {
		txtLastName.sendKeys(lastName);

	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);

	}
	
	public void setTelephone(String telephone) {
		txtTelephone.sendKeys(telephone);
	}

	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void setPasswordConfirm(String passwordConfirm) {
		txtPasswordConfirm.sendKeys(passwordConfirm);
	}

	public void setPrivacyPolicy() {

		chkdPolicy.click();
	}

	public void clickContinue() {
	/*	Actions action = new Actions(driver);
		action.moveToElement(btnContinue).click().perform();

		*/ btnContinue.click();

	}
	
	
	public String validateAccountCreation() {

		return accountCreationText.getText();
	}

}
