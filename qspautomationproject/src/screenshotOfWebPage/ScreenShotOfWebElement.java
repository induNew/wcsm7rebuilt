package screenshotOfWebPage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenShotOfWebElement {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads");
		//screenshot of WebElement
		
		WebElement target =
				driver.findElement(By.xpath("//h1[.='Downloads']"));
		
		File src = target.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/sswebelement.png");
		Files.copy(src,dest);
		
		
		
	}

}
