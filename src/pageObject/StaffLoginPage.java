package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class StaffLoginPage {
	WebDriver driver;
	public StaffLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void staffLogin(String staffLoginURL) throws InterruptedException {
		driver.get(staffLoginURL);
		Thread.sleep(2000);
	}
}
