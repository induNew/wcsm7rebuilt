package asiignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qu5 {
	
	//perform the action (maximize) on any of the child window
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();

		String parentTitle = driver.getTitle();
		
		String parentHandle = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		
		
		for(String wh:allHandles)
		{
			String currentTitle = driver.switchTo().window(wh).getTitle();
			if(!parentTitle.equals(currentTitle))
			{
				driver.switchTo().window(wh).manage().window().maximize();
			}
			else
			{
				driver.switchTo().window(wh).close();
			}
		}

	}
	

}
