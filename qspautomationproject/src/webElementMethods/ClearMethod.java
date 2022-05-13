package webElementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//login operation
		
		WebElement unTextBox = driver.findElement(By.name("txtUsername"));
		WebElement passTextBox = driver.findElement(By.name("txtPassword"));
		unTextBox.sendKeys("Admin");
		passTextBox.sendKeys("admin123");
		Thread.sleep(4000);
		
		unTextBox.clear();
		passTextBox.clear();
		
	}
}
