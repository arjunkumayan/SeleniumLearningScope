package SeleniumExceptionsList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementNoClickableatPointDemo {

	
	@Test
	public void elementnotClickable() {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		
		
		//driver.findElement(By.id("persistent")).click();
		
		driver.findElement(By.xpath("//input[@id='persistent']//parent::span/label")).click();
		
		//When I saw the screenshot of the failed test on Jenkins I see that the header is overlapping the button that I want to click
		// try using different xpaht tht would take the click
		
	}
	
	@Test
	public void clickUsingAction() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("persistent"))).click().build().perform();
		
		
		
	}
}
