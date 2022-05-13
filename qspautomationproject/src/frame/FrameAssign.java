package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssign {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Desktop/1wcsm7htmldocs/un.html");
	//
		driver.findElement(By.id("un")).sendKeys("admin");
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='frid']"));
		
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("pwd")).sendKeys("manager");
		//.
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("un")).clear();
		
		
		
		
		
		
		
		
		
	}

}
