package WebElements;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementNotInteractableException {
	
	
	@Test
	public void googleSearch() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		// Trying search element
		driver.findElement(By.name("q")).sendKeys("facebook");
		
		// Locating first suggestions button and click on it  why first suggestion bcz whatever we type that wil come first always
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@role='option']//span)[1]")));
		ele.click();
		
		Assert.assertTrue(ExpectedConditions.titleContains("facebook").apply(driver).booleanValue());
		
		// org.openqa.selenium.ElementNotInteractableException: element not interactable
		/*
		 * When people get this exception then they will start experimenting by putting some wait or wait for clickable
		 * or javascript click. in this scenario only javascript click may work as it directly works at DOM
		 * level but we bypassed the actual reason
		 * 
		 * As per official doc -
		 * ElementNotInteractableException is thrown to indicate that although an element is present on the DOM, it is not in a state that can be interacted with.
		 * 
		 * if you see the xpath of the first option from auto suggestions we are instructing webdriver to perform click on a span
		 * tag but is span tag is clickable element above and we ended up with ElementNotInteractable exception 
		 * 
		 * Please not aspan or div can be made clickable bt using another element find like here use of LI tag is clickable for first suggestions
		 * 
		 * 
		 * 
		 */
		
		
		
	}
	
	@Test
	public void googleSearchWithNoExceptionTest() {
		
		// this changes the xpath
         WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		// Trying search element
		driver.findElement(By.name("q")).sendKeys("facebook");
		
		// Locating first suggestions button and click on it  why first suggestion bcz whatever we type that wil come first always
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//ul[@role='listbox']//li)[1]")));
		ele.click();
		
		Assert.assertTrue(ExpectedConditions.titleContains("facebook").apply(driver).booleanValue());
	}

}
