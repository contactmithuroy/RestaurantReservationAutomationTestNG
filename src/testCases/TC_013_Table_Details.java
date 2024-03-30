package testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObject.TableDetails;
import pageObject.StaffLoginPage;
import testBase.BaseClass;

public class TC_013_Table_Details extends BaseClass{
	TableDetails tableDetails;
	StaffLoginPage staffLoginPage;
	
	@Test(priority= 1, groups="Staff Account",description="table page view successfully")
	@Parameters({"staffLoginURL"})
	public void searchtable(String staffLoginURL) throws InterruptedException {
		tableDetails = new TableDetails(driver);
		staffLoginPage =  new StaffLoginPage(driver);
		staffLoginPage.staffLogin(staffLoginURL);
		tableDetails.searchtable(staffLoginURL);
		
	}
	@Test(priority= 2, groups="Staff Account", description = "Staff will check all tables succcessfully")
	@Parameters({"staffLoginURL"})
	public void showAlltablesData(String staffLoginURL) throws InterruptedException {
		tableDetails.showAlltablesData(staffLoginURL);
	}
	/*
	@Test(priority= 3, groups="Staff Account", description = "Staff create new table succcessfully")
	@Parameters({"staffLoginURL", "staffHomeURL"})
	public void addNewTable(String staffLoginURL, String staffHomeURL) throws InterruptedException {

		staffLoginPage =  new StaffLoginPage(driver);
		staffLoginPage.staffLogin(staffLoginURL);
		tableDetails = new TableDetails(driver);
		tableDetails.addNewTable(staffHomeURL);
		
	}*/
	
}
