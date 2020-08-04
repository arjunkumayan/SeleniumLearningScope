package NinjaSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextDemo {

	private WebDriver driver;
	String baseUrl1;
	String baseUrl2;
	
	
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		baseUrl1="https://letskodeit.teachable.com/p/practice";
		baseUrl2 = "https://www.expedia.co.in/";
	}
	@Test
	public void testGetText() throws InterruptedException {
		driver.get(baseUrl1);
	   WebElement buttonElement = driver.findElement(By.id("opentab"));
	   String elementText = buttonElement.getText();
	   
	   System.out.println("Text on the element is: "+ elementText);	   
	
	}
		
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}


	

}
