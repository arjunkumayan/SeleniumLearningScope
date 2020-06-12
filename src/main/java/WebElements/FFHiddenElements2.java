package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FFHiddenElements2 {
	// ElementNotVisibleException - Element is not visible and so not able to interact with
	// hiddent elements are those elements which are having type= hidden
	
	@Test // Using getLocation concept of coordinate
	public void FFHiddenElements() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
		//driver.findElement(By.id("male")).click();  // it will ElementNotVisibleException because it has two attribute id = male but first element type is hidden
		
		// How to solve it get the 
		
		// you have four radion all having to different id but name attribute is same so how to handle this
		
		/*
		 *  <input id ="java" name = "lang" />
		 *  <input id ="c#" name = "lang" />
		 *  <input id ="Ruby" name = "lang" />
		 *  <input id ="Python" name = "lang" />
		 */
	
		// Radio button and CheckBox
		
	
		
		
	}
	
	

}
