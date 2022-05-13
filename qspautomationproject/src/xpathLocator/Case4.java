package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case4 {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.puma.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'puma') and contains(@class,'validated')]")).sendKeys("shoes");
		
	}

}
