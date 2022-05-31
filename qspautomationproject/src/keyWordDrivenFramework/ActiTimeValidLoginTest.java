package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLoginTest extends BaseTest {

	
	public static void main(String[] args) throws IOException, InterruptedException {

	//object creation
	BaseTest bt = new BaseTest();
	Flib flib = new Flib();
	
	//read the data from property file use the generic reusable method
	String username = flib.readPropertyFile(PROP_PATH,"username");
	String password = flib.readPropertyFile(PROP_PATH,"password");
	//open the browser
	bt.openBrowser();
	Thread.sleep(3000);
	//perform login
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	
	//close the browser
	bt.closeBrowser();
	
	
	
	}
}
