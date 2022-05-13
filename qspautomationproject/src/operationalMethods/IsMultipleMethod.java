package operationalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/HP/Desktop/1wcsm7htmldocs/singleselectdropdown.html");

		WebElement dropdownElement = driver.findElement(By.id("menu"));
		
		Select sel = new Select(dropdownElement);
		boolean statusOfDropdown = sel.isMultiple();
		System.out.println(statusOfDropdown);
	}

}
