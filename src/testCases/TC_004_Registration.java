package testCases;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObject.RegistrationPage;
import testBase.BaseClass;
import utilities.Utils;

public class TC_004_Registration extends BaseClass{
	RegistrationPage registrationPage;
	Utils utils=new Utils();
	
	@Test(priority = 1, groups="Registration_Account", description="User can registration successfully")
	@Parameters({"homePageURL"})
	public void doRegistration(String homePageURL) throws InterruptedException, IOException, ParseException {
		
		registrationPage = new RegistrationPage(driver);
		utils=new Utils();
	    utils.getUserRegistrationCreds(0);
	    
		
		//System.out.println("TC_004  page is working"+utils.getNewEmail());
		//System.out.println("TC_004  page is working"+utils.getNewName());
		//System.out.println("TC_004  page is working"+utils.getNewPassword());
		
		//System.out.println("TC_004  page is working"+utils.getNewPhoneNumber());
		
		
	    registrationPage.registration(homePageURL, utils.getNewEmail(),utils.getNewName(),utils.getNewPassword(),utils.getNewPhoneNumber());
		
	}
}
