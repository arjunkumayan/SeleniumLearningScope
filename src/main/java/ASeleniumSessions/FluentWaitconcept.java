package ASeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitconcept {

	public static void main(String[] args) {

		// Explicit wait
		//1. WebDriver wait
		//2. Fluent wait
		//a. Timeout b. polling c. ignoreException
		
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.get("http://classic.crmpro.com");
		
		final By username = By.name("username");
		By password = By.name("password");
		By LoginButton = By.xpath("//input[@value='Login']");
		
		waitForElementFluentWait(driver, username).sendKeys("arjunkumayan18@gmail.com");;
		
		driver.findElement(password).sendKeys("Defence@5050");
		
		driver.findElement(LoginButton).click();
		
		
		
				
	}
	
	// when to use - to handle ajax components  - without refreshing the entire page you are just updating the section of code
	
	
	
	public static WebElement waitForElementFluentWait(WebDriver driver, final By locator)
	{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				
				return driver.findElement(locator);
			}
		});
		
		return element;
	}
	
	public static WebElement waitForElementPresentWithFluentWait(WebDriver driver, final By locator)
	{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		// return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement element =	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		return element;
	}

	public static Boolean waitForTitleContains(WebDriver driver, int withTimeOut, int pollingWait, String title)
	{
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(withTimeOut))
		.pollingEvery(Duration.ofSeconds(pollingWait))
		.ignoring(NoSuchElementException.class);
		
		
		
		  Boolean flag = wait.until(ExpectedConditions.titleContains(title));
		  
		  return flag;
			
	}
	
}
