package NinjaSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsElementDisplayed {
	
	WebDriver driver;
	String baseUrl;
	GenericMethods gm;
	
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		gm= new GenericMethods(driver);
		baseUrl ="https://letskodeit.teachable.com/p/practice";
		
		// Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testMethod() {
		driver.get(baseUrl);
		
	boolean result1 =gm.isElementPresent("name", "id");
	System.out.println("Is Element present: "+result1);
	
	
	boolean result2 =gm.isElementPresent("name-not-present", "id");
	System.out.println("Is Element present: "+result2);
	
		
	}
	
	@After
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
