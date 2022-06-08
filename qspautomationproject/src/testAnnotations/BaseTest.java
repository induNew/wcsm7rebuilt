package testAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;
	@BeforeTest
	public void setProperty()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
