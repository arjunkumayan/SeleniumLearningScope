package NinjaSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SliderActions {

	
	private WebDriver driver;
	private String baseUrl;
	private JavascriptExecutor js;
		
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		js= (JavascriptExecutor)driver;
		baseUrl ="https://jqueryui.com/slider/";
		
		// Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testSliderDrag() throws InterruptedException {
		
		driver.get(baseUrl);
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);	
		
		// Using the Action class
		WebElement element =driver.findElement(By.xpath("//div[@id='slider']/span"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(element, 100, 0).perform();
		
		
		
		
	}
	
	
	
	@After
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
	
}
