package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BillDetails {
	WebDriver driver;
	public BillDetails(WebDriver driver) {
		this.driver =  driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[normalize-space()='Bills']")
	private WebElement billsButton;
	
	@FindBy(xpath="//input[@id='search']")
	WebElement textSearch;
	@FindBy(xpath="//button[normalize-space()='Search']")
	WebElement searchButton;
	@FindBy(xpath="//td[normalize-space()='22']")
	private WebElement searchValue;
	
	@FindBy(xpath="//a[normalize-space()='Show All']")
	private WebElement showAll;
	
	@FindBy(xpath="//tbody/tr[1]/td[10]/a[1]//*[name()='svg']")
	private WebElement receiptDownload;
	
	
	public void searchBill(String staffLoginURL) throws InterruptedException {
		//driver.get(staffLoginURL);
		billsButton.click();
		textSearch.sendKeys("22"); // Send Hardcode value
		searchButton.click();
		String searchValue2 = searchValue.getText();
		Assert.assertEquals(searchValue2, "22","Bill search successfully by bill id.");
		Thread.sleep(2000);
	}
	public void showAllBills(String staffLoginURL) throws InterruptedException {
		this.searchBill(staffLoginURL);
		showAll.click();
		Thread.sleep(2000);
	}
	
	public void billReceiptDownload(String staffLoginURL) throws InterruptedException {
		this.searchBill(staffLoginURL);
		receiptDownload.click();
		Thread.sleep(2000);
	}
	
	
}
