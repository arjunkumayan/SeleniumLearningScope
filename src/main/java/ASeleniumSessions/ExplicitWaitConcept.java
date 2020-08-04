package ASeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		

	}
	
	public static WebElement exlicitWait(WebDriver driver, int timeout, By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		return element;
		
	}

}
