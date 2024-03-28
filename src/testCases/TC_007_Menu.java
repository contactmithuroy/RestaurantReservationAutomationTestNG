package testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObject.MenuPage;
import testBase.BaseClass;

public class TC_007_Menu extends BaseClass{
	MenuPage menuPage;
	@Test(priority = 1, groups="Navigation_Menu",description="Menu section page view successfully")
	@Parameters({"homePageURL"})
	public void menuCheck(String homePageURL) throws InterruptedException {
		menuPage = new MenuPage(driver); // contstructor class
		menuPage.menuCheck(homePageURL);
	}
	
	@Test(priority = 2, groups="Navigation_Menu",description="Main dishes section view successfully")
	@Parameters({"homePageURL"})
	public void mainDisheCheck(String homePageURL) throws InterruptedException {
		menuPage = new MenuPage(driver); // contstructor class
		menuPage.mainDisheCheck(homePageURL);
	}
	
	@Test(priority = 3, groups="Navigation_Menu",description="Side dises section view successfully")
	@Parameters({"homePageURL"})
	public void sideDisheCheck(String homePageURL) throws InterruptedException {
		menuPage = new MenuPage(driver); // contstructor class
		menuPage.sideDisheCheck(homePageURL);
	}
	
	@Test(priority = 4, groups="Navigation_Menu",description="Drink dishes section view successfully")
	@Parameters({"homePageURL"})
	public void drinksDisheCheck(String homePageURL) throws InterruptedException {
		menuPage = new MenuPage(driver); // contstructor class
		menuPage.drinksDisheCheck(homePageURL);
	}
}
