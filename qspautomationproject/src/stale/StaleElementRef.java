package stale;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRef {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-smc8hiai/login.do");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		
		WebElement usn = driver.findElement(By.name("username"));
		WebElement psw = driver.findElement(By.name("pwd"));
		usn.sendKeys("admin");
		Thread.sleep(5000);
		
		//refresh the browser
		driver.navigate().refresh();
		usn.sendKeys("new");

	}

}
