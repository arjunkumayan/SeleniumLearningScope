package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomWaitDemo {
	
	
	public WebElement getElementWitWait(WebDriver driver,By locator, int timeout) {
		WebElement element = null;
		for(int i =0 ; i<timeout; i++)
		{
		try {
		element = driver.findElement(locator);
		break;
		}		
		catch(Exception e) {
			System.out.println("Some exception occured while creating the webelement");
			
		}
		}
		return element;
	}
	
	public void clickElement(WebDriver driver,By locator,int timeout)
	{
		WebElement element = null;
		
		try {
			element = getElementWitWait(driver, locator, timeout);
			element.click();
		}
		catch(Exception e)
		{
			System.out.println("some exception occured while clicking the element");
			
		}
	}

	public static void main(String[] args) {// TODO Auto-generated method stub

	}

}
