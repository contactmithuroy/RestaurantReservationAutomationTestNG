package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TableDetails {
	WebDriver driver;
	public TableDetails(WebDriver driver) {
		this.driver =  driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[normalize-space()='Table']")
		private WebElement tablesButton;
	
	@FindBy(xpath="//input[@id='search']")
		private WebElement textSearch;
	@FindBy(xpath="//button[normalize-space()='Search']")
		private WebElement searchButton;
	@FindBy(xpath="//td[normalize-space()='11']")
		private WebElement searchValue;
	
	@FindBy(xpath="//a[normalize-space()='Show All']")
		private WebElement showAll;
	
	@FindBy(xpath="//a[normalize-space()='Add Table']")
		private WebElement addTable;

	@FindBy(xpath="//input[@id='next_tab_idle']")
		private WebElement tableId;
	@FindBy(xpath="//input[@id='capacity']")
		private WebElement capacity;
	@FindBy(xpath="//input[@value='Create table']")
		private WebElement createTable;
	
	public void searchtable(String staffLoginURL) throws InterruptedException {
		tablesButton.click();
		textSearch.sendKeys("11"); // Send Hardcode value
		searchButton.click();
		String searchValue2 = searchValue.getText();
		Assert.assertEquals(searchValue2, "11","table search successfully by table id.");
		Thread.sleep(2000);
	}
	public void showAlltablesData(String staffLoginURL) throws InterruptedException {
		this.searchtable(staffLoginURL);
		showAll.click();
		Thread.sleep(2000);
	}
	public void addNewTable(String staffHomeURL) throws InterruptedException {
		tablesButton.click();
		addTable.click();
		Thread.sleep(2000);
		String createNewId = tableId.getAttribute("value");
		capacity.clear();
		capacity.sendKeys("4");
		createTable.click();
		//Handle Window
		driver.get(staffHomeURL);
		Assert.assertEquals(createNewId, createNewId, "New table create successfully");
		Thread.sleep(3000);
		
	}
	
	
}
