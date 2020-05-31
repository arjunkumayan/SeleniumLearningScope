package ASeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLoginImplicitWait {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://app.hubspot.com");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); // dynacmic wait
		// implicitly wait - it applies on all elements of the page - global wait
		// applied for all the elements - only for the WebElements
		// Global wait
		// dynamic wait
		// it applies on driver
		
		System.out.println(driver.getTitle());
		
		WebElement email =  driver.findElement(By.id("username"));
		WebElement pwd =  driver.findElement(By.id("password"));
		WebElement loginBtn =  driver.findElement(By.id("loginBtn"));
		
		email.sendKeys("arjunkumayan18@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		
		
	}

}
