package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class StaffLoginPage {
	WebDriver driver;
	public StaffLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='account_id']")
	private WebElement staffAccountID;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement staffAccountPassword;
	@FindBy(xpath="//button[normalize-space()='Login']")
	private WebElement staffLogin;
	public void staffLogin(String staffLoginURL) throws InterruptedException {
		String staffID = "7";
		String StaffPassword = "robertpass";
		
		driver.get(staffLoginURL);
		Thread.sleep(2000);
		
		staffAccountID.sendKeys(staffID);
		staffAccountPassword.sendKeys(StaffPassword);
		staffLogin.click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Dashboard - SB Admin","Staff are not going to dashboard page");
		Thread.sleep(2000);
	}
}
