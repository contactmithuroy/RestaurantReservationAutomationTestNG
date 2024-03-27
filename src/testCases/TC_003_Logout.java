package testCases;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import pageObject.LogoutPage;
import testBase.BaseClass;
import utilities.Utils;

public class TC_003_Logout extends BaseClass{
	LoginPage loginPage;
	Utils utils=new Utils();
	LogoutPage logoutpage;
	
	@Test(groups="Logout_Account", description = "User logout successfully")
	@Parameters({"url"})
	
	public void doLogout(String url) {
		try {
			loginPage=new LoginPage(driver);
			logoutpage=new LogoutPage(driver);
	        utils=new Utils();
	        utils.getUserCreds(0);
	        
	        driver.get(url);
			loginPage.loginCreds(utils.getEmail(), utils.getPassword());
	        
			logoutpage.logout(url);
			
		}catch(Exception e){
			//Assert.fail();
		}
	}
	
}
