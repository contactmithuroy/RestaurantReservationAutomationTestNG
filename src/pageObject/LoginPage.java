package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@name='email']")
	public WebElement textEmailAddress;
	
	@FindBy(xpath="//*[@name='password']")
	public WebElement textPassword;
	
	@FindBy(xpath="//*[@name='submit']")
	public WebElement btnLogin;
	
	//Test Steps
	public int loginCreds(String email, String password) throws InterruptedException {

		textEmailAddress.clear();
		textPassword.clear();
		textEmailAddress.sendKeys(email);
		Thread.sleep(1000);
		textPassword.sendKeys(password);
		Thread.sleep(1000);
		
		btnLogin.click();
		return 0;
	}
}
