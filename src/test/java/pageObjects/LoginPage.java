package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	

	@FindBy(xpath = "//*[@name='username']")
	 WebElement usernameField;

	@FindBy(xpath = "//*[@name='password']")
	 WebElement passwordField;

	@FindBy(xpath = "//button[@type='submit']")
      WebElement loginButton;
	
	public void setEmail(String emailID) {
		usernameField.sendKeys(emailID);
	}

	public void setPassword(String userPassword) {
		passwordField.sendKeys(userPassword);
	}

	public void loginButtonClick() {
		loginButton.click();
	}
}
