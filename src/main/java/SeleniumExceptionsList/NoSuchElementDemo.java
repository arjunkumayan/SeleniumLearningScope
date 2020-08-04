package SeleniumExceptionsList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
// What are different Exception 
// when do you see NoSuchElementException and how do you handle it
// what are different ways to handle the exception

/*
 * this class is talks about the nosuch element exception
 */
public class NoSuchElementDemo {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String baseUrl = "https://learn.letskodeit.com/";
       //1. this is one way
		// driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(baseUrl);

	}

	@Test
	public void timeIssue() {
   
		 // 1. Timing Issue
		/*
		 * We are typing in emailField to do enter text but when selenium webdriver started doing sendkeys on email field
		 * the page was not loaded, it was still moving, it was still rotatingm, it was not completely loaded and the email field
		 * was not rendered thats why its fail to find it
		 * 
		 * how to solve this
		 *  - implicit wait
		 *   - explicit wait
		 *   - fluent wait
		 */
		
		WebElement loginclick = driver.findElement(By.xpath("//a[@href='/sign_in']"));
		loginclick.click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 3);
		//WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
		WebElement emailField = driver.findElement(By.id("user_email"));
		emailField.sendKeys("arjun");

	}

	@Test
	public void IncorrectLocatorIssue() {

		
		//2. Incorrect Locator or Type of Locator
		WebElement loginclick = driver.findElement(By.xpath("//a[@href='/sign_in']"));
		loginclick.click();
		
		
		// With wrong locator type id instead of Xpath
		//driver.findElement(By.id("//a[@href='/sign_in']")).click();
		
		// With wrong page user is on loging page but trying to click on home page
		
		try {
			Thread.sleep(2000);
			driver.findElement(By.id("user_email")).click();
			
		} catch (InterruptedException e) {
			
		}
		
		/*
		 *    SomeTimes we are on the wrong page and try to click on another page
		 *    SomeTimes the Xpath is not correct
		 *    SomeTimes we are using By.id("but here writing the xpth");
		 *    
		 *     Make sure locator type are correct
		 * 
		 */
	}

	@Test
	public void ElementIsInFrameIssue() {
		// 3. Element is in iframe
		
		driver.get("https://letskodeit.teachable.com/p/practice");
		
		//driver.switchTo().frame("courses-iframe");
		//driver.switchTo().frame(1);
		driver.findElement(By.id("search-courses")).sendKeys("Selenium Java");
		//driver.switchTo().defaultContent();
		
		// if before switching to frame if you are trying to enter something or any operation of selenium webdriver then
		// you will get the noSuchElementException
		

	}

}
