package asiignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qu2 {
	//how to close all the browsers without quit method ?
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String wh:allHandles)
		{
			driver.switchTo().window(wh).close();
		}


	}	

}
