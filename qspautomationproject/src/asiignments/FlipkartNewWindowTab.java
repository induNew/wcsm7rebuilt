package asiignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartNewWindowTab {


	public static void main(String[] args) {



		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();

		driver.findElement(By.name("q")).sendKeys("samsung f12");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F12 (Sea Green, 64 GB)']")).click();
		String parentHandle = driver.getWindowHandle();
		Set<String> allhandles =driver.getWindowHandles();

		for(String wh : allhandles)
		{
			if(!parentHandle.equals(wh))
		{
				driver.switchTo().window(wh);
			}
			else
			{

			}
		}

		driver.findElement(By.xpath("//a[.='128 GB']")).click();
		driver.findElement(By.xpath("//li[@id='swatch-0-color']/a")).click();

		driver.findElement(By.id("pincodeInputId")).clear();
		driver.findElement(By.id("pincodeInputId")).sendKeys("411033");
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();







	}
}
