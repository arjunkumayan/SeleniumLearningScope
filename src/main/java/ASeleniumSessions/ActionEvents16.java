package ASeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionEvents16 {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://app.hubspot.com");
		
		
		Thread.sleep(5000);
		
	WebElement emailId = driver.findElement(By.id("username"));
	
	Actions action = new Actions(driver);
	
	action.sendKeys(emailId, "test@gmail.com").build().perform();
	
	WebElement password = driver.findElement(By.id("password"));
	action.sendKeys(password, "test123");
	
	
	// difference between action class sendkeys and normal sendkeys
	// action class sendkeys - first move to element and then perfom the sendkeys
	
	//action.moveToElement(driver.findElement(By.id("loginBtn"))).click().build().perform();
	action.click(driver.findElement(By.id("loginBtn"))).build().perform();
	// it clicks to middle of element
	
	
	}

}
