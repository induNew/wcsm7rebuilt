package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.switchTo().activeElement().sendKeys("bike");
		Thread.sleep(4000);
		List<WebElement> suggestions =
				driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));

		
		for(int i=0;i<suggestions.size();i++)	
		{
			WebElement suggestion = suggestions.get(i);
			String textOfTheWebElement = suggestion.getText();
			System.out.println(textOfTheWebElement);
			
		}


	}

}
