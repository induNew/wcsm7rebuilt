package javaScriptExecutorOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Desktop/1wcsm7htmldocs/disabled.html");




		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement usn = driver.findElement(By.id("i1"));
		if(usn.isEnabled())
		{
			usn.sendKeys("admin");
		}

		else
		{
			System.out.println("else block is executed");
			jse.executeScript("document.getElementById('i1').value='admin'");
		}


		WebElement pass = driver.findElement(By.id("i2"));
		if(pass.isEnabled())
		{
			pass.sendKeys("manager");
		}

		else
		{
			jse.executeScript("document.getElementById('i2').value='manager'");
		}












	}

}
