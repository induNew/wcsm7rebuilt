package javaScriptExecutorOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D1 {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/HP/Desktop/1wcsm7htmldocs/disabled.html");
	
	
	
	
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("document.getElementById('i1').value='admin'");
	
	driver.findElement(By.id("i2")).sendKeys("manager");
	
	
	
	
	}

}
