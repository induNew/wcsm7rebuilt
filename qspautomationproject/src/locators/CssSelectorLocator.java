package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//login operation
		
		driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("Admin");//type username
		driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("admin123");//type password
		driver.findElement(By.cssSelector("input[id='btnLogin']")).click();//click on login button
		
		
		
	}

}
