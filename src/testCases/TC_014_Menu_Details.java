package testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObject.StaffLoginPage;
import pageObject.MenuDetails;
import testBase.BaseClass;

public class TC_014_Menu_Details extends BaseClass{
	MenuDetails menuDetails;
	StaffLoginPage staffLoginPage;
	
	@Test(priority= 1, groups="Staff Account",description="menu page view successfully")
	@Parameters({"staffLoginURL"})
	public void searchmenu(String staffLoginURL) throws InterruptedException {
		menuDetails = new MenuDetails(driver);
		staffLoginPage =  new StaffLoginPage(driver);
		staffLoginPage.staffLogin(staffLoginURL);
		menuDetails.searchMenu(staffLoginURL);
		
	}
	@Test(priority= 2, groups="Staff Account", description = "Staff will check all menus succcessfully")
	@Parameters({"staffLoginURL"})
	public void showAllmenusData(String staffLoginURL) throws InterruptedException {
		menuDetails.showAllMenusData(staffLoginURL);
	}
	
	@Test(priority= 3, groups="Staff Account", description = "Staff create new menu succcessfully")
	@Parameters({"staffLoginURL", "staffHomeURL"})
	public void addNewmenu(String staffLoginURL, String staffHomeURL) throws InterruptedException {

		staffLoginPage =  new StaffLoginPage(driver);
		staffLoginPage.staffLogin(staffLoginURL);
		menuDetails = new MenuDetails(driver);
		menuDetails.addNewMenu(staffHomeURL);
		
	}
	
}

