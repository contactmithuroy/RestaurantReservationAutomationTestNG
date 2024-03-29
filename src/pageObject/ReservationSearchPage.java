package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservationSearchPage {
	//Create  method
	WebDriver driver;
	public ReservationSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Reservation']")
	private WebElement reservation;
	
	//Search Reservation
	@FindBy(xpath="//div[@class='form-group']//input[@id='reservation_date']")
	private WebElement selectSearchDate;
	@FindBy(name="reservation_time")
	private WebElement selectTime;
	@FindBy(xpath="//option[@value='12:00:00']")
	private WebElement textTime;
	@FindBy(xpath="//button[normalize-space()='Search']")
	private WebElement textSearch;
	
	//Make Reservation
	@FindBy(xpath="//input[@id='customer_name']")
	private WebElement customerName;

	@FindBy(xpath="//select[@id='table_id_reserve']")
	private WebElement availableTables;
	@FindBy(css="option[value='2']")
	private WebElement forPeopleAndTableId;
	@FindBy(xpath="//textarea[@id='special_request']")
	private WebElement specialRequest;
	@FindBy(xpath="//button[normalize-space()='Make Reservation']")
	private WebElement makeReservation;
	
	
	public void reservSearch(String homePageURL) throws InterruptedException {
		driver.get(homePageURL);
		reservation.click();
		Thread.sleep(1000);
		
		selectSearchDate.sendKeys("02/12/2024");	
		selectTime.click();
		textTime.click();
		Thread.sleep(1000);	
		textSearch.click();
		Thread.sleep(3000);
	}
	public void makeReservation(String homePageURL) throws InterruptedException {
		Actions act = new Actions(driver);
		
		customerName.sendKeys("Mithu ROy");
		// No need to set Data and Time, because we already set date and time in reservation search 
		availableTables.click();
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ARROW_DOWN).perform();;
		specialRequest.sendKeys("One glss of coke");
		Thread.sleep(5000);
		
		makeReservation.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}
}
