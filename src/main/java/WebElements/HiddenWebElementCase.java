package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenWebElementCase {
	
	/*
	 *  Hidden elements are displayed only after certain conditions are met
	 *  
	 *  How they look like
	 *  1- Html attribute - type= hidden
	 *  2- CSS 
	 *   <button id ="clickme" stype = "display: none;" onclick=myfunction()">Try it</button>
	 * 
	 * In code they will be either hidden by using an HTML attibute called hidden or 
	 * using CSS selector display property to NONe as shown below
	 *  <button id ="clickme" stype = "display: none;" onclick=myfunction()">Try it</button>
	 */
	
	@Test
	public void hiddentControl() {
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(" ");
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;  
		WebElement hiddenButton =  driver.findElement(By.xpath("//button"));
		String script = "arguments[0].click();";
		
		js.executeScript(script, hiddenButton);
		
	}

}
