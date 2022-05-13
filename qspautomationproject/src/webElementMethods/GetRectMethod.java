package webElementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
		
		WebElement news = driver.findElement(By.xpath("//h2[.='News']"));
		Point loc = news.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
	
		
		System.out.println(xaxis+" x axis distance");
		System.out.println(yaxis+" y axis distance");
		
		Rectangle rect = news.getRect();
		int height = rect.getHeight();
		int width = rect.getWidth();
		
		
		System.out.println(height+" height");
		System.out.println(width+ " width");
		
		news.getTagName();
	}
	

}
