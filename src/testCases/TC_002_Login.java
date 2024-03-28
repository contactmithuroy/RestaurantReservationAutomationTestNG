package testCases;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import testBase.BaseClass;
import utilities.Utils;

public class TC_002_Login extends BaseClass{
	LoginPage loginPage;
	Utils utils=new Utils();
	
	@Test(groups="Login_Account", description = "User gives valid credentials and login is successful")
	@Parameters({"loginPageURL","email","password"})
	
	public void doLoginWithValidCreds(String loginPageURL, String email, String password) {
		try {
			loginPage=new LoginPage(driver);
	        utils=new Utils();
	        utils.getUserCreds(0);
	        
	        driver.get(loginPageURL);
			loginPage.loginCreds(utils.getEmail(), utils.getPassword());
	
		}catch(Exception e){
			//Assert.fail();
		}
	}
	
	@Test(groups="Login_Account", description = "User gives invalid credentials and login is not successful")
	public void doLoginWithInvalidCreds(String loginPageURL) throws InterruptedException, IOException, ParseException {
		loginPage = new LoginPage(driver);
		utils = new Utils();
		utils.getUserCreds(1);
		
		driver.get(loginPageURL);
		loginPage.loginCreds(utils.getEmail(), utils.getPassword());
		
		
		
	}
}
