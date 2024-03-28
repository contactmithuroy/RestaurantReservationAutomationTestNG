package testCases;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObject.AboutUsPage;
import testBase.BaseClass;

public class TC_005_AboutUS extends BaseClass{
	AboutUsPage aboutUsPage;
	
	@Test(groups="Navigation_Menu",description="Page About us section view successfully")
	@Parameters({"homePageURL"})
	public void aboutUs(String homePageURL) throws InterruptedException {
		aboutUsPage = new AboutUsPage(driver);
		aboutUsPage.aboutUs(homePageURL);
	}
}
