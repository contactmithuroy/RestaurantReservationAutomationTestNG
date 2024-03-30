package testCases;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObject.BillDetails;
import pageObject.StaffLoginPage;
import testBase.BaseClass;

public class TC_012_Bill_Details extends BaseClass{
	BillDetails billDetails;
	StaffLoginPage staffLoginPage;
	
	@Test(priority= 1, groups="Staff Account",description="Bill page view successfully")
	@Parameters({"staffLoginURL"})
	public void searchBill(String staffLoginURL) throws InterruptedException {
		billDetails = new BillDetails(driver);
		staffLoginPage =  new StaffLoginPage(driver);
		staffLoginPage.staffLogin(staffLoginURL);
		billDetails.searchBill(staffLoginURL);
		
	}
	@Test(priority= 2, groups="Staff Account", description = "Staff will check all bills succcessfully")
	@Parameters({"staffLoginURL"})
	public void showAllBills(String staffLoginURL) throws InterruptedException {
		billDetails.showAllBills(staffLoginURL);
	}
	
	@Test(priority= 3, groups="Staff Account", description = "Download bills receipt succcessfully")
	@Parameters({"staffLoginURL"})
	public void billReceiptDownload(String staffLoginURL) throws InterruptedException {
		billDetails.billReceiptDownload(staffLoginURL);
	}
	
}
