package testCases;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObject.ReservationDetails;
import pageObject.StaffLoginPage;
import testBase.BaseClass;

public class TC_015_Reservation_Details extends BaseClass {
	ReservationDetails reservationDetails;
	StaffLoginPage staffLoginPage;
	
	@Test(priority= 1, groups="Staff Account",description="Reservation page view successfully")
	@Parameters({"staffLoginURL"})
	public void searchReservation(String staffLoginURL) throws InterruptedException {
		reservationDetails = new ReservationDetails(driver);
		staffLoginPage =  new StaffLoginPage(driver);
		staffLoginPage.staffLogin(staffLoginURL);
		reservationDetails.searchReservation(staffLoginURL);
	}
	
	@Test(priority= 2, groups="Staff Account",description="All Reservations view successfully")
	@Parameters({"staffLoginURL"})
	public void showAllReservation(String staffLoginURL) throws InterruptedException {
		reservationDetails.showAllReservation(staffLoginURL);	
	}
	
	@Test(priority= 3, groups="Staff Account",description="Add new Reservations")
	@Parameters({"staffLoginURL"})
	public void addNewReservation(String staffLoginURL) throws InterruptedException {
		staffLoginPage =  new StaffLoginPage(driver);
		staffLoginPage.staffLogin(staffLoginURL);
		reservationDetails.addNewReservation(staffLoginURL);
	}
}
