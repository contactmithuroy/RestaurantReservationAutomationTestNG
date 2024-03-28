package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AboutUsPage {
	WebDriver driver;
	public AboutUsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=("//a[normalize-space()='About']"))
	WebElement textAbout;
	
	@FindBy(xpath = "//section[@id='about']//h2[1]")
	WebElement textAboutSection;
	
	public void aboutUs(String homePageURL) throws InterruptedException {
		driver.get(homePageURL);
		textAbout.click();
		Thread.sleep(1000);
		
		String aboutTitle = textAboutSection.getText();
		Assert.assertEquals(aboutTitle, "Sambar'S House DINING & BAR Company History", "About us secton title is not correct");
	}
}
