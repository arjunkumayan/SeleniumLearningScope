package SeleniumExceptionsList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementReferenceDemo1 {
	
	// Unlike other exception this is not the sync issue
	// not a timing issue 
	// not a locator issue its just a easy exception so lets take a look
	
	// Stale - > Not fresh
	//  Element is not fresh
	// Element is not new
	// Element is stale
	

	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letskodeit.teachable.com/p/practice");
		WebElement bmwCheckbox = driver.findElement(By.id("bmwcheck"));
		//driver.navigate().refresh();
		// If the page changes/reloads
		// DOM is rebuilt
		// Previously found element becomes stale
		// Element will show up the same locator but it got changes in the dom
		// the one you found previously is not the fresh one now
		// element is not attached to the page document because page reloaded and dom got changes
		
		
		driver.get(driver.getCurrentUrl());
		
		// now how to solve it whenever this happens just find the element when you actually need it
		//
		bmwCheckbox = driver.findElement(By.id("bmwcheck"));
		bmwCheckbox.click();
	}
	
	

}
