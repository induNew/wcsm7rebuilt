package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodSetSize {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//set the size of the browser
		//new Dimension(width,height);
		Dimension targetSize = new Dimension(450, 250);
		driver.manage().window().setSize(targetSize);
	}

}
