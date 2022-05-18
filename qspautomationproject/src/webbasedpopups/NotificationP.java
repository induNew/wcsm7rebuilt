package webbasedpopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class NotificationP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--disable-notifications");//disable the notification popup
		co.addArguments("-start-maximized");//maximize the browser
		
		WebDriver driver=new ChromeDriver(co);
		
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		
		driver.get("https://optinmonster.com/what-is-a-popup-notification/");
		

	}
}
