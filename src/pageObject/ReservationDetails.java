package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testCases.TC_008_Reservation_Search;

public class ReservationDetails {
	WebDriver driver;
	public ReservationDetails(WebDriver driver) {
		this.driver =  driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[normalize-space()='Reservations']")
		private WebElement reservationsButton;
	
	@FindBy(xpath="//input[@id='search']")
		private WebElement enterReservationID;
	
	@FindBy(css="button[type='submit']")
		private WebElement submit;
	@FindBy(xpath="//td[normalize-space()='Jean Ng']")
		private WebElement searchTextValue;
	
	@FindBy(xpath="//a[normalize-space()='Show All']")
		private WebElement showAll;
	
	@FindBy(xpath="//a[normalize-space()='Add Reservation']") 
	private WebElement addReservation;
	
	//Reservation 
	@FindBy(xpath="//div[@class='form-group']//input[@id='reservation_date']")
		private WebElement selectSearchDate;
	@FindBy(name="reservation_time")
		private WebElement selectTime;

	@FindBy(xpath="//select[@id='reservation_time']")
	private WebElement availableReservationTimes;
	@FindBy(xpath="//input[@value='Search Available']")
		private WebElement textSearch;
	
	//Make Reservation
	@FindBy(xpath="//input[@id='customer_name']")
		private WebElement customerName;

	@FindBy(xpath="//select[@id='table_id_reserve']")
		private WebElement availableTables;

	@FindBy(xpath="//input[@id='special_request']")
		private WebElement specialRequest;
	
	@FindBy(xpath="//input[@name='submit']")
		private WebElement makeReservation;
	
		
	
	public void searchReservation(String staffLoginURL) throws InterruptedException {
		reservationsButton.click();
		enterReservationID.sendKeys("Jean Ng"); // Send Hardcode value
		submit.click();
		String searchValue2 = searchTextValue.getText();
		Assert.assertEquals(searchValue2, "Jean Ng","Reservation search successfully by table id.");
		Thread.sleep(2000);
	}
	
	public void showAllReservation(String staffLoginURL) throws InterruptedException {
		this.searchReservation(staffLoginURL);
		showAll.click();
		Thread.sleep(4000);
	}
	
	public void addNewReservation(String staffLoginURL) throws InterruptedException {
		Actions act = new Actions(driver);
		reservationsButton.click();
		addReservation.click();
		Thread.sleep(3000);
		
		selectSearchDate.sendKeys("02/12/2024");	
		selectTime.click();
		availableReservationTimes.click();
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);	
		
		textSearch.click();
		Thread.sleep(3000);
		
		
	
		customerName.sendKeys("Rupok Ariyal");
		specialRequest.clear();
		specialRequest.sendKeys("One glss of coke");
		Thread.sleep(1000);
		// No need to set Data and Time, because we already set date and time in reservation search 
		availableTables.click();
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ARROW_DOWN).perform();
	
		makeReservation.click();
		Thread.sleep(2000);
		
	}
	
	
}
