package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MenuDetails {
	WebDriver driver;
	public MenuDetails(WebDriver driver) {
		this.driver =  driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[normalize-space()='Menu'])[1]")
		private WebElement menuButton;
	@FindBy(xpath="//select[@id='search']")
		private WebElement selectItem;
	@FindBy(xpath="//button[normalize-space()='Search']")
		private WebElement searchButton;
	@FindBy(xpath="//button[normalize-space()='Search']")
		private WebElement showAll;
	@FindBy(xpath="(//a[normalize-space()='Add Item'])[1]")
		private WebElement addItem;
	//Add New Menu
	@FindBy(xpath="//input[@id='item_id']")
		private WebElement itemID;
	@FindBy(xpath="//input[@id='item_name']")
		private WebElement itemName;
	@FindBy(xpath="//select[@id='item_type']")
		private WebElement itemType;
	
	@FindBy(xpath="//select[@id='item_category']")
		private WebElement itemCategory;
	@FindBy(css="option[value='Main Dishes']")
		private WebElement mainDishes;
	
	@FindBy(xpath="//input[@id='item_price']")
		private WebElement itemPrice;
	@FindBy(xpath="//textarea[@id='item_description']")
		private WebElement itemDescription;
	
	@FindBy(xpath="//input[@value='Create Item']")
		private WebElement createItem;
	
	public void searchMenu(String staffLoginURL) throws InterruptedException {
		menuButton.click();
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		searchButton.click();
		//String searchValue2 = selectItem.getText();
		//Assert.assertEquals(searchValue2, "11","table search successfully by table id.");
		Thread.sleep(2000);
	}
	public void showAllMenusData(String staffLoginURL) throws InterruptedException {
		this.searchMenu(staffLoginURL);
		showAll.click();
		Thread.sleep(2000);
	}
	
	public void addNewMenu(String staffHomeURL) throws InterruptedException {
		Actions act = new Actions(driver);
		
		menuButton.click();
		addItem.click();
		Thread.sleep(1000);
		
		itemID.clear();
		itemID.sendKeys("H98");
		
		itemName.clear();
		itemName.sendKeys("Idli");
		
		itemPrice.clear();
		itemPrice.sendKeys("12");
		
		itemDescription.clear();
		itemDescription.sendKeys("Free with sambar");
		Thread.sleep(1000);
		
		itemType.click();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		
		//itemCategory.click();
		//act.sendKeys(Keys.ARROW_UP).perform();
		//Thread.sleep(1000);
		mainDishes.click();
		
		createItem.click();
		Thread.sleep(8000);
	}
}
