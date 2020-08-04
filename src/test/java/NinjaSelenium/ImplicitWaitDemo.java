package NinjaSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitDemo {
	
	WebDriver driver;
	String baseUrl;
		
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		baseUrl ="https://letskodeit.teachable.com/p/practice";
		
		// Maximize
		driver.manage().window().maximize();		
	}
	
	@Test
	public void testMethod() {
		driver.get(baseUrl);

		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
		emailField.sendKeys("test");
	}
	
	@After
	public void tearDown() throws InterruptedException {		
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
