package synchronisation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LaunchActiTime3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("http://laptop-smc8hiai/login.do");
		//explicitly wait
		
	//	WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.titleContains("Login"));
		System.out.println("The login page title is verified");
	
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		
		//wait.until(ExpectedConditions.titleContains("Enter"));
		String actualHomePageTitle = driver.getTitle();
		
		System.out.println("The home page title is verified");
		
		
		
		
		
	}

}
