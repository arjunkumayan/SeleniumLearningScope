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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoCompleteDropdown {
	
	// 1. Build Xpath lang attributes common to all these options
	//2. Use tag name common to all these options
	//3. user class name common to all these options
	
	WebDriver driver;
	String baseUrl;
		
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		baseUrl ="https://www.goibibo.com/";
		
		// Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void testAutoComplete() throws InterruptedException {
		driver.get(baseUrl);
		String partialText = "Del";
		String textToSelect ="Delta Junction, United States(DJN)";
		
		WebElement textField = driver.findElement(By.id("gosuggest_inputSrc"));
		textField.sendKeys(partialText);
		
		WebElement uiElement = driver.findElement(By.id("react-autosuggest-1"));
		String innerHtml = uiElement.getAttribute("innerHTML");		
		System.out.println(innerHtml);
		
		
		List<WebElement> liElements = uiElement.findElements(By.tagName("li"));
		
		Thread.sleep(3000);
		for(WebElement element :liElements) {
			//System.out.println(element.getText());
			if(element.getText().contains(textToSelect)) {
				System.out.println("Selected: "+element.getText());
				element.click();
				break;
			}
					
		}
	}
	
	
	
	
	@After
	public void tearDown() throws InterruptedException {		
		Thread.sleep(2000);
		//driver.quit();
	}
	
	
	
	
	
	
	
	

}
