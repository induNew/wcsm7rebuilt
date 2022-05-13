package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RunTimePolymorphism {

	public static void main(String[] args) {

		WebDriver driver;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser which you want open");
		String browserValue = sc.nextLine();
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com");
		}
		
		
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com");
			
		}
		
		else
		{
			System.out.println("enter some valid input");
		}



	}

}
