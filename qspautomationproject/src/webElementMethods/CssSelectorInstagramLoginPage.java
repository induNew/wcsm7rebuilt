package webElementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorInstagramLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com");
		
		Thread.sleep(4000);
		//login operation
		
		
		driver.findElement(By.name("username")).sendKeys("surajsawant");
		driver.findElement(By.name("password")).sendKeys("idontknow");
		WebElement loginButton = 
				driver.findElement(By.cssSelector("button[class*='L3NKy']"));
		loginButton.submit();
		
		
	}

}
