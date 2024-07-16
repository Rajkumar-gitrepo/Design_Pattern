package testCases;

import org.testng.annotations.Test;

import pageObjects.BaseClass;
import pageObjects.LoginPage;

public class LoginTestCase extends BaseClass {
	
	//WebDriver driver;
	
	@Test
	public void loginFunc()
	{
		LoginPage lp = new LoginPage();
		lp.setEmail("admin");
		lp.setPassword("admin");
		lp.loginButtonClick();
		
	}
}
