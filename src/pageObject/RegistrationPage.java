package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[normalize-space()='ACCOUNT']")
	WebElement textAccount;
	
	@FindBy(xpath="//a[normalize-space()='Sign Up']")
	WebElement textSignIn;
	
	
	//Registration xpath
	@FindBy(xpath="//input[@placeholder='Enter Email']")
	WebElement textEmail;
	
	@FindBy(xpath="//input[@placeholder='Enter Member Name']")
	WebElement textMember_Name;
	
	@FindBy(xpath="//input[@placeholder='Enter Password']")
	WebElement textPassword;
	
	@FindBy(xpath="//input[@placeholder='Enter Phone Number']")
	WebElement textPhone_Number;

	
	//Register button
	@FindBy(xpath="//button[normalize-space()='Register']")
	WebElement textRegister;
	
	
	
	public void registration(String homePageURL, String newEmail, String newName, String newPassword, String newPhoneNumber) throws InterruptedException {
		
		System.out.println("Registration page is working"+newEmail+""+newName+newPassword+""+newPhoneNumber+"");
		driver.get(homePageURL);
		textAccount.click();
		Thread.sleep(1000);
		textSignIn.click();
		Thread.sleep(1000);
		
		//String rn = RandomStringUtils.randomNumeric(5);
		textEmail.sendKeys(newEmail);
		textMember_Name.sendKeys(newName);
		textPassword.sendKeys(newPassword);
		textPhone_Number.sendKeys(newPhoneNumber);
		textRegister.click();
	}
}
