package webElementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://laptop-smc8hiai/login.do");
		
		
		WebElement checkboxKeepMeLoggedIn =
				driver.findElement(By.id("keepLoggedInCheckBox"));
		
		boolean status = checkboxKeepMeLoggedIn.isSelected();
		System.out.println(status);//false 
		Thread.sleep(3000);
		checkboxKeepMeLoggedIn.click();//selected
		boolean status2 = checkboxKeepMeLoggedIn.isSelected();
		System.out.println(status2);//tr
		
		
		
	
	

	}

}
