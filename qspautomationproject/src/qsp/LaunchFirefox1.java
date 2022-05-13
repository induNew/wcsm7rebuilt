package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");//to avoid the IllegalStateException
		FirefoxDriver driver = new FirefoxDriver();//to open the browser
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.instagram.com");//launch the web app
		Thread.sleep(10000);//provide the delay of 10 seconds
		driver.close();//close the browser


	}

}
