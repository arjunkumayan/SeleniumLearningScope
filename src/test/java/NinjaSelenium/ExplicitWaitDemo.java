package NinjaSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitDemo {
	
	WebDriver driver;
	String baseUrl;
		
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		baseUrl ="https://letskodeit.teachable.com/p/practice";
		
		// Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testMethod() {		driver.get(baseUrl);
		
	  driver.findElement(By.linkText("Login")).click();
	  
	  driver.findElement(By.id("user_email")).sendKeys("test");	
		
	}
	
	@After
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
