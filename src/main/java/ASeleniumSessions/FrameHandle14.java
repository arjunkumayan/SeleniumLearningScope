package ASeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle14 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//1. frame with webelement
		//WebElement frameElement = driver.findElement(By.name("main"));
		//driver.switchTo().frame(frameElement);
		
		//2. frame with name
		//driver.switchTo().frame("main");
		
		//3. frame with number
		driver.switchTo().frame(2);
		
		String text =	driver.findElement(By.cssSelector("body > h2")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		// driver.switchTo().parentFrame();
		
		
		
	}

}
