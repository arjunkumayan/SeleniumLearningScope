package SeleniumHierarchy;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
	
	final By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By loginBtn = By.xpath("//input[@type='submit']");
	By contactsLink = By.xpath("//a[text()='Contact']");
	
	
	// Explicit wait:
			// 1. WebDriverWait
			// 2. FluentWait :
			// a. TimeOut b. pollingPeriod c.ignoringException d. unit
			
			//when to use:
			//For handling the Ajax components
	
	@Test
	public void getFluentWaitConcept() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/");
		
		//waitForFluentWait(driver, username, 5).sendKeys("arjunkumaya@gmail.com");
		//waitForElementWithFluentWait(driver, password, 5).sendKeys("Defence@5050");
		
	//	doWaitForElementVisibility(driver, username, 5).sendKeys("arjunkumaya@gmail.com");
		
//		Boolean available = doGetElementVisibility(driver, password, 5);
//		if(available) {
//			driver.findElement(password).sendKeys("Defence@gmail.com");
//		}
//		
//		Thread.sleep(3000);
//		waitForFluentWait(driver, loginBtn, 1).click();
		
		doSendKeys(driver, username, 5, "arjun@gmail.com");
		
		
		doSendKeys(driver, password, 5, "Defence@5050");
		
		String text = doGetText(driver, contactsLink, 5);
		System.out.println(text);
		getPageScreenShot(driver, "CRMPRO");
		doClick(driver, loginBtn, 5);
		
	}
	
	public static WebElement waitForFluentWait(WebDriver driver, By locator, long seconds) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.pollingEvery(Duration.ofSeconds(seconds))
				.withTimeout(Duration.ofSeconds(seconds))
				.ignoring(NoSuchElementException.class);
	return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	
		
	}
	
	public static WebElement waitForFluentWaitCheck(WebDriver driver, By locator, long seconds, long timeout) {
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.pollingEvery(Duration.ofSeconds(seconds))
				.withTimeout(Duration.ofSeconds(timeout))
				.ignoring(NoSuchElementException.class);
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		 
		
		
	}
	
	public static WebElement waitForFluentWaitConcept(WebDriver driver, long secs,int timeout,By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.pollingEvery(Duration.ofSeconds(secs))
				.withTimeout(Duration.ofSeconds(timeout))
                 .ignoring(Exception.class);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
				
	}
	
	public static WebElement waitForFluentWaitTest(WebDriver driver,By locator,long secs) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).pollingEvery(Duration.ofSeconds(secs))
				.withTimeout(Duration.ofSeconds(secs))
				.ignoring(Exception.class);
		
		 WebElement element = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				
				return driver.findElement(locator);
			}
			
			
		});
		 
		 return element;
	}
	
	
	public static WebElement waitForFluent(WebDriver driver, By locator, long timeout, long seconds) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.pollingEvery(Duration.ofSeconds(seconds))
				.withTimeout(Duration.ofSeconds(timeout))
				.ignoring(NoSuchElementException.class);
		
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {

			
			@Override
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
			
			
		});
		return element;
	}
	
	public static WebElement waitForElementWithFluentWait(WebDriver driver, By locator, long seconds) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).pollingEvery(Duration.ofSeconds(seconds))
				.withTimeout(Duration.ofSeconds(seconds)).ignoring(NoSuchElementException.class);
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {

				return driver.findElement(locator);

			}

		});
		return element;

	}
	
	
	
	public static Boolean doWaitForTitleContains(WebDriver driver,By locator,long timeout,String title) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.titleContains(title));
		
		
	}
	
	public static void doWaitForExplicitWait(WebDriver driver, By locator, long timeout, String title) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleContains(title));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
public static WebElement doWaitForElementVisibility(WebDriver driver,By locator,long timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			
	}

public static Boolean doGetElementVisibility(WebDriver driver,By locator,long timeout) {
	WebDriverWait wait = new WebDriverWait(driver, timeout);
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	return true;
	
}

public static Boolean doGetPresenceOfElement(WebDriver driver,By locator,long timeout) {
	WebDriverWait wait = new WebDriverWait(driver, timeout);
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	return true;
	
}

public static WebElement getElement(WebDriver driver,By locator,int timeout) {
	WebElement element = null;
	
	try {
		if(doGetPresenceOfElement(driver, locator, timeout)) {
		element = driver.findElement(locator);
		}
	}
	catch(Exception e) {
		System.out.println("Some Exception occured while getting the element");
		
	}
	return element;
}

public static boolean doGetVisibilityOfElement(WebDriver driver, int timeout, By locator) {
	
	WebDriverWait wait = new WebDriverWait(driver, timeout);
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	return true;
		
}

public static WebElement doGetElement1(WebDriver driver, By locator, int timeout) {
	WebElement element= null;
	try {
	if(doGetPresenceElementTest(driver, locator, timeout)) 
	element =driver.findElement(locator);
	}
	catch(Exception e) {
		System.out.println("Some exception occured");
	}
	return element;
		
	}
	
	


public static void doSendKeys(WebDriver driver,By locator,int timeout,String keys) {
	
	getElement(driver, locator, timeout).sendKeys(keys);
	
}

public static void doClick(WebDriver driver,By locator,int timeout) {
	getElement(driver, locator, timeout).click();
}


public static String doGetText(WebDriver driver,By locator,int timeout) {
	return getElement(driver, locator, timeout).getText();
}

public static void getPageScreenShot(WebDriver driver,String fileName) {
	
	TakesScreenshot screenshot=(TakesScreenshot)driver;
	File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(srcFile, new File("./target/Screenshots/"+fileName+".png"));
	} catch (IOException e) {
		e.printStackTrace();
	}
}


public static void getPageScreenshotTest(WebDriver driver, String fileName) {
	
	TakesScreenshot screenshot = (TakesScreenshot)driver;
File srcFile =	screenshot.getScreenshotAs(OutputType.FILE);
	
try {
	FileUtils.copyFile(srcFile, new File("./target/Screenshots/"+fileName+".png"));
} catch (IOException e) {
	e.printStackTrace();
}


	
}

public static boolean doGetPresenceElementTest(WebDriver driver,By locator, int timeout) {
	
	
	WebDriverWait wait = new WebDriverWait(driver, timeout);
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	return true;
	}

	public static WebElement doGetElement(WebDriver driver, By locator, int timeout) {

		WebElement element = null;

		try {
			if (doGetPresenceElementTest(driver, locator, timeout)) {
				element = driver.findElement(locator);
			}
		} catch (Exception e) {
			System.out.println("Some exception occured by generating the element");
		}

		return element;

	}






}
