package NinjaSelenium;

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

public class JavaScriptExecution {
	
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
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testJavascriptExecution() {		
		
		//Navigation
		js.executeScript("window.location = 'https://letskodeit.teachable.com/p/practice';");
		
		//findElement
		WebElement textBox = (WebElement) js.executeScript("return document.getElementById('name');");
		textBox.sendKeys("test");		
		
	}
	
	@Test
	public void testWindowSize() {			
		//Navigation
		js.executeScript("window.location = 'https://letskodeit.teachable.com/p/practice';");
		
		Long height = (Long) js.executeScript("return window.innerHeight;");		
		Long width = (Long) js.executeScript("return window.innerWidth;");
	
		System.out.println("Height is: "+ height);
		System.out.println("Widht is: "+width);
		
		
	}
	
	@Test
	public void testPageScroll() throws InterruptedException {		
		
		//Navigation
		js.executeScript("window.location = 'https://letskodeit.teachable.com/p/practice';");
		
		//Scroll Down
		js.executeScript("window.scrollBy(0,1900);");
		Thread.sleep(2000);
		
		//Scroll up
		js.executeScript("window.scrollBy(0,-1900);");		
		Thread.sleep(2000);
		
		//Scroll Element into view		
		WebElement element = driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);		
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-190);");	
	}
	
	@Test
	public void testJavaScriptClick1() throws InterruptedException {	
		js.executeScript("window.location = 'https://letskodeit.teachable.com/p/practice';");
		Thread.sleep(4000);	
	   WebElement bmwButton = driver.findElement(By.id("bmwcheck"));	
	  
	   js.executeScript("arguments[0].click();", bmwButton);
	  
	}
	
	@Test
	public void testJavaScriptClick2() throws InterruptedException {	
		js.executeScript("window.location = 'https://login.yahoo.com/';");
		Thread.sleep(4000);	
	   WebElement checkElement = driver.findElement(By.id("persistent"));	
	   
	   System.out.println(checkElement.isDisplayed());
	   System.out.println(checkElement.isSelected());

	  // checkElement.click(); // ElementNotInteractableException
	   
	  js.executeScript("arguments[0].click();", checkElement);
	    System.out.println(checkElement.isSelected());
	  
	}
	
	@Test
	public void testJavaScriptSendkeys() throws InterruptedException {	
	
		driver.get("https://www.retailmenot.com/");
		
		driver.findElement(By.xpath("//button[contains(@class,'login-button')]")).click();
		
		WebElement emailField = driver.findElement(By.id("identifier"));
	    System.out.println(emailField.isDisplayed());
	
	    js.executeScript("arguments[0].value='arjun'", emailField);
	    
	  
	}
	
	
	@After
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		//driver.quit();
	}
	
	
	
	
	
	
	
	

}
