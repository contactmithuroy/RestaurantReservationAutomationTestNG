package testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObject.StaffLoginPage;
import testBase.BaseClass;

public class TC_011_Staff_Login extends BaseClass{
	StaffLoginPage staffLoginPage;
	
	@Test(groups="Staff Login Account", description = "Staff gives valid credentials and login is successful")
	@Parameters({"staffLoginURL"})
	public void staffLogin(String staffLoginURL) throws InterruptedException {
		staffLoginPage =  new StaffLoginPage(driver);
		staffLoginPage.staffLogin(staffLoginURL);

	}
}
