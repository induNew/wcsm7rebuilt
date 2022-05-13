package asiignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartassign2 {

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("laptop");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		driver.findElement(By.xpath("//div[.='Core i5']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and .='Brand']")).click();
		
		driver.findElement(By.xpath("//div[.='HP']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and .='Operating System']")).click();
		driver.findElement(By.xpath("//div[.='Windows 10']/preceding-sibling::div[@class='_24_Dny']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
