package SeleniumExceptionsList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementReferenceDemo2 {
	
	// Unlike other exception this is not the sync issue
	// not a timing issue 
	// not a locator issue its just a easy exception so lets take a look
	
	// Stale - > Not fresh
	//  Element is not fresh
	// Element is not new
	// Element is stale
	
	//https://www.southwest.com/
	WebDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.southwest.com/air/booking/index.html?clk=GSUBNAV-AIR-BOOK");
		
	}
	
	@Test
	public void test1() {
		String searchingTest ="";
		
		String partialText ="New York";
		WebElement text = driver.findElement(By.id("originationAirportCode"));
		
		
		
		
	}
	
	@AfterTest
	public void tearDown() {
		
		
	}
	
	

}
