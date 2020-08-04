package NinjaSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitWithUtilityDemo {
	
	WebDriver driver;
	String baseUrl;
	WaitTypes wt;
		
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		baseUrl ="https://letskodeit.teachable.com/p/practice";
		wt = new WaitTypes(driver);
		// Maximize
		driver.manage().window().maximize();
		}
	
	@Test
	public void testMethod() {
		driver.get(baseUrl);
		driver.findElement(By.linkText("Login")).click();
		WebElement emailField = wt.waitForElement(By.id("user_emil"), 3);
		emailField.sendKeys("test");
		wt.clickWhenReady(By.name("commit"), 3);
	}
	
	@After
	public void tearDown() throws InterruptedException {		
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
