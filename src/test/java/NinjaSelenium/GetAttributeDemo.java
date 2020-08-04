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

public class GetAttributeDemo {

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
		
	}
	@Test
	public void testGetText() throws InterruptedException {
		driver.get(baseUrl1);
	   WebElement element = driver.findElement(By.id("name"));
	   String attributeValue = element.getAttribute("type");
	   
	   System.out.println("value of attribute is: "+ attributeValue);	 
	   
	
	}
		
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}


	

}
