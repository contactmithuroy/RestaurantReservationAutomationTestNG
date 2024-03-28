package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContactPage {
	WebDriver driver;
	public ContactPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Contact']")
	WebElement textContact;
	
	@FindBy(xpath = "//div[@class='contact container']//div//h1[@class='section-title']")
	WebElement textContactSection;
	
	public void contuctUs(String homePageURL) throws InterruptedException {
		driver.get(homePageURL);
		textContact.click();
		Thread.sleep(1000);
		String contact = textContactSection.getText();
		Assert.assertEquals(contact, "CONTACT INFO","About us secton title is not correct");
	}
}
