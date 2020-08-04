package SeleniumExceptionsList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import SeleniumSessions.JavaScriptExecutorTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementNotClickableDemo {
	
	@Test
	public void test1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Element is loaded in the DOM, but it is wrapped by another element
		// Element is not visible because of another element
		//Element is not clickable at point (xx, xx). Other element would receive the click'.
		
		/*
		 * This happens when the element is loaded into the DOM, but the position is not fixed on the UI. There can be some other divs or images or ads that are not loaded completely. And ChromeDriver always tries to click the middle of the element.

There are work around that worked to resolve the issue. But to make sure the best and simple solution is to find out the exact reason to fix the problem. We need to figure out which part of the div/image is taking time to load. Before clicking on an element we need to make sure the element is present in the DOM, visible in the UI and the last is Position is fixed. When the element position is fixed the problem is solved. If you want to check that, try Thread.sleep or verify in debug mode.
		 * 
		 * 
		 */
		driver.get("https://login.yahoo.com/");
		
		WebElement emailfield = driver.findElement(By.id("login-username"));
		
		emailfield.sendKeys("testing");
		
		//WebElement loginButton = driver.findElement(By.id("persistent"));
		//loginButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
		
		
		
		WebElement loginbtn = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("persistent"))));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("persistent")));
		
		// this invisible element is the one which is exactly overlapping the our desired element
		// so we are waiting till the overlapped element is completely displayed or loaded properlly
		// Suppose in a webpage there is
		// Email Field or Password field or login button
		// but when the page is still loading and you are trying to clicking on login button when 
		 // the login button is overlapped by some other element that is loader
		// overlapped element may be anything like spring loader or div or images
		
		
	// 1. first ways - using Explicit wait for inivisible overlapping element
		
		boolean invisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
		
		if(invisible) {
			WebElement loginButn = driver.findElement(By.xpath(""));
			loginButn.click();
		}
		
	//2. second ways -  javascriptExecutor
		
		WebElement loginB = driver.findElement(By.id(""));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",loginB );
		
		
		// Here we are able to find the element but just not able to click the element
		// due to overlapped the element
		

		
		
		loginbtn.click();
		
		
	}

	//What is Element not clickable exception
	// Different solutions to handle this
	// 
	
	/*
	 * org.openqa.selenium.WebDriverException:
	 *  Element is not clickable at point (775.25, 10.166671752929688). Other element would receive the click: <div class="globalHeader-UtilTop"></div>

Command duration or timeout: 69 milliseconds
	 * 
	 */
	
	// so above this element <div class="globalHeader-UtilTop"> overlapping the actula element for click
	// There are multiple ways to handle this exception -
	//1. try to maximize the window and check -
	//2. JavaScriptExecutor  (JavascriptExecutor)driver.executeScript("arguments[0].click()",driver.findElement()); 
	// 3. using JavascriptExecutor - Scroll to Options 
	//4. Actions class - action.moveToElement().click().perform();
	//5. js.executeScript("scroll(250, 0)"); js.executeScript("scroll(0, 250)");
	//6. using getElementLocation - 
	// js.executeScript("window.scrollTo(0,"element.getLocation().x+")");
     //element.click();
    
	//   js.executeScript("window.scrollTo(0,"element.getLocation().y+")");
    //  element.click();
	
	// 7. most prefereble is 
	/*
	 * wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(""))); // here pass the element which is overlapping in above case it is this - <div class="globalHeader-UtilTop"> 
		
	 */
}
