package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MenuPage {
	WebDriver driver;
	public MenuPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Menu']")
	private WebElement textMenu;
	
	@FindBy(xpath="//select[@id='menu-category']")
	private WebElement textITEMS;
	
	
	@FindBy(xpath="//option[@value='yellow']")
	private WebElement mainDishe;
	@FindBy(xpath="//div[@class='yellow msg']//h1[contains(text(),'MAIN DISHES')]")
	private WebElement mainDisheTitle;
	
	@FindBy(xpath="//option[@value='red']")
	private WebElement sideDishe;
	@FindBy(xpath="//div[@class='red msg']//h1[contains(text(),'SIDE DISHES')]") 
	private WebElement sIDEDISHES;
	
	@FindBy(xpath="//option[@value='green']")
	private WebElement drinksDishe;
	@FindBy(xpath="//div[@class='green msg']//h1[contains(text(),'DRINKS')]")
	private WebElement dRINKS;
	
	
	public void menuCheck(String homePageURL) throws InterruptedException {
		driver.get(homePageURL);
		textMenu.click();
		Thread.sleep(1000);
	}
	
	public void mainDisheCheck(String homePageURL) throws InterruptedException {
		driver.get(homePageURL);
		textMenu.click();
		Thread.sleep(1000);
		mainDishe.click();
		Thread.sleep(2000);
		String contact = mainDisheTitle.getText();
		Assert.assertEquals(contact, "MAIN DISHES","Main Dishes items are not showing");
	}
	
	public void sideDisheCheck(String homePageURL) throws InterruptedException {
		driver.get(homePageURL);
		textMenu.click();
		Thread.sleep(1000);
		sideDishe.click();
		Thread.sleep(2000);
		String contact = sIDEDISHES.getText();
		Assert.assertEquals(contact, "SIDE DISHES","Main Dishes items are not showing");
	}
	
	public void drinksDisheCheck(String homePageURL) throws InterruptedException {
		driver.get(homePageURL);
		textMenu.click();
		Thread.sleep(1000);
		drinksDishe.click();
		Thread.sleep(2000);
		String contact = dRINKS.getText();
		Assert.assertEquals(contact, "DRINKS","Main Dishes items are not showing");
	}
	
	
	
	
}
