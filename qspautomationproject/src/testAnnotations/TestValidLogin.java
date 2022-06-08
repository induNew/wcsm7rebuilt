package testAnnotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestValidLogin extends BaseTest {

	@Test
	public void search1() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("Java");

	}

	@Test
	public void search2() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("SQL");

	}
	
	@Test
	public void search3() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("Automation");

	}

}
