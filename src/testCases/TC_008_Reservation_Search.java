package testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObject.ReservationSearchPage;
import testBase.BaseClass;
public class TC_008_Reservation_Search extends BaseClass{
	ReservationSearchPage reservationSearchPage;
	
	@Test(priority=1, groups="Reservation", description="Reservation search successfully by date")
	@Parameters({"homePageURL"})
	public void  reservationSearch(String homePageURL) throws InterruptedException {
		reservationSearchPage = new ReservationSearchPage(driver);
		reservationSearchPage.reservSearch(homePageURL);
	}
	
	@Test(priority=2, groups="Reservation", description="New reservation successfully")
	@Parameters({"homePageURL"})
	public void makeReservation(String homePageURL) throws InterruptedException{
		this.reservationSearch(homePageURL);
		reservationSearchPage.makeReservation(homePageURL);
	}
}
