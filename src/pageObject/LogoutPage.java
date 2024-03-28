package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	WebDriver driver;
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[normalize-space()='ACCOUNT']")
	WebElement textAccount;
	
	@FindBy(xpath = ("//a[normalize-space()='Logout']"))
	public WebElement btnLogout;
	
	public void logout(String url) throws Exception {
		System.out.println("Logout Page Running");
		textAccount.click();
		Thread.sleep(2000);
		btnLogout.click();
		
		driver.get(url);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.F5).perform();
		Thread.sleep(4000);
		
		
		
		
	}
}
