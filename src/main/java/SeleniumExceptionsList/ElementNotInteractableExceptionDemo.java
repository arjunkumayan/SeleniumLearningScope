package SeleniumExceptionsList;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementNotInteractableExceptionDemo {
	//org.openqa.selenium.ElementNotInteractableException: element not interactable
	 
	// The reason is the other html element overlapped the element we are using for clicking
	
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
	public void testJavaScriptClick2() throws InterruptedException {	
		js.executeScript("window.location = 'https://login.yahoo.com/';");
		Thread.sleep(4000);	
	   WebElement checkElement = driver.findElement(By.id("persistent"));	
	   
	   System.out.println(checkElement.isDisplayed());
	   System.out.println(checkElement.isSelected());

	   checkElement.click();
	 
	  	}

}
