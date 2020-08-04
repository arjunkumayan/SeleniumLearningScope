package NinjaSelenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchFrame {

	
	private WebDriver driver;
	private String baseUrl;
		private JavascriptExecutor js;
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		js= (JavascriptExecutor)driver;
		
		baseUrl ="https://letskodeit.teachable.com/p/practice";
		
		// Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws InterruptedException {
		
		driver.get(baseUrl);
		WebElement frameElement = driver.findElement(By.id("courses-iframe"));
		//driver.switchTo().frame(frameElement);
		//System.out.println("Switch to frame using webElement");
		
		// Frame with name
		//driver.switchTo().frame("iframe-name");
		//System.out.println("Switch to frame using name");
		//Frame with id
		//driver.switchTo().frame("courses-iframe");
		//System.out.println("Switch to frame using id");
	    
		//Frame with index
		driver.switchTo().frame(0);
		System.out.println("Switch to frame using index");
		WebElement searchBox = driver.findElement(By.id("search-courses"));
	    searchBox.sendKeys("test");
             
       driver.switchTo().defaultContent();
     
       Thread.sleep(2000);
       
       driver.findElement(By.id("name")).sendKeys("test successfull");
		
	}
	
	@After
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		//driver.quit();
	}
	
}
