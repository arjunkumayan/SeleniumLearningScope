package PageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	public WebElement getElement(WebDriver driver,By locator){
		WebElement element = null;
		try {
			//if(waitForElementPresent(locator));  // depends on your requirement if it working for all test case then good otherwise individually use wait at test case directly
		 element = driver.findElement(locator);
		 		} catch (Exception e) {
			System.out.println("some exception got occureed while creating the web element.........");
		}
		return element;
	}
	
	
	public void doClick(WebDriver driver, By locator)	{
		try {
		getElement(driver,locator).click();
		}catch (Exception e) {
			System.out.println("some exception got occurred while clicking on the web element.......");
		}
		
	}
	
	public void doSendKeys(WebDriver driver, By locator, String value) {
		try {
	WebElement element = getElement(driver,locator);
	 element.clear();
	 element.sendKeys(value);
		} catch (Exception e) {
			System.out.println("some exception got occurred while entering value in a field.......");
		}
	}
}
