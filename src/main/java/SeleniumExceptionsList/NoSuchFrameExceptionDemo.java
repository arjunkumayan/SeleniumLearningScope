package SeleniumExceptionsList;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchFrameExceptionDemo {

	
	private WebDriver driver;
	private String baseUrl;
	private JavascriptExecutor js;
		
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		js= (JavascriptExecutor)driver;
		baseUrl ="https://jqueryui.com/droppable/";
		
		// Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testMouseHover() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(3000);
		
		driver.switchTo().frame("//iframe[@class='demo-frame']");
		Actions action = new Actions(driver);
		
		WebElement fromElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement toElement = driver.findElement(By.xpath("//div[@id='droppable']"));
					
		Thread.sleep(2000);
		
		action.dragAndDrop(fromElement, toElement).build().perform();
		
		//action.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();
		
	    driver.switchTo().defaultContent();
		
	}
	
		
	
	@After
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
	
}
