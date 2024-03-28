package testCases;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObject.ContactPage;
import testBase.BaseClass;

public class TC_006_ContactInformation extends BaseClass{
	ContactPage contactPage;
	@Test(groups="Navigation_Menu",description="Page contuct us section view successfully")
	@Parameters({"homePageURL"})
	public void contactUs(String homePageURL) throws InterruptedException {
		contactPage = new ContactPage(driver); // contstructor class
		contactPage.contuctUs(homePageURL);
	}
}
