package testBase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	
	@BeforeClass(groups= {"regression"})
	//@Parameters({"url"})
	public void setUp() {
		System.setProperty("webdriver.edge.driver",".\\resources\\msedgedriver.exe");
		driver = new EdgeDriver(); //launch edge 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	
	@AfterClass
    public void closeDriver() throws InterruptedException{
		Thread.sleep(5000);
       driver.quit();
    }
	
}
