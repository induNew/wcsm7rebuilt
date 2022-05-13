package synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchActiTime2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("http://laptop-smc8hiai/login.do");
		
		String actualLoginPageTitle = driver.getTitle();
		
		if(actualLoginPageTitle.equals("actiTIME - Login"))
		{
			System.out.println("The test case is passed ! Login page title is matched ");
		}
		
		else
		{
			System.out.println("The test case is failed ! Login page title is not  matched ");
		}
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(10000);
		String actualHomePageTitle = driver.getTitle();
		
		
		if(actualHomePageTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("The test case is passed ! Home page title is matched ");
		}
		
		else
		{
			System.out.println("The test case is failed ! Home page title is not  matched ");
		}
		
		
		
	}

}
