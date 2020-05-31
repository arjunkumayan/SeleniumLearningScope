package ASeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {
	
	
	WebDriver driver;
	
	public Util(WebDriver driver)
	{
		this.driver=driver;
	}
	
	/**
	 * this method is used to get the element by passing the By locator
	 * @param locator
	 * @return
	 */
	/**
	 * @param locator
	 * @return
	 */
	public WebElement getElement(By locator)
	{
		WebElement element = null;
		try {
			 // waitForelementPresent(locator,20);
		      element = driver.findElement(locator);
		}
		catch(Exception e)
		{
			  System.out.println("Some exception occured while creating the webelement....");
			  System.out.println(e.getMessage());
			  e.printStackTrace();
		}
		return element;
	}
	/**
	 * this method is used to click on element
	 * @param locator
	 */
	
	public void doClick(By locator)
	{
		try
		{
			getElement(locator).click();
		}
		catch(Exception e)
		{
			System.out.println("some exception occured while clicking on the webelement...");
			System.out.println(e.getMessage());
		}
		
	}

	/**
	 * this method is used to send the keys
	 * @param locator
	 */
	public void doSendKeys(By locator, String keys)
	{
		try
		{
		getElement(locator).sendKeys(keys);
		}
		catch(Exception e)
		{
			System.out.println(" Some exception occured while passing value to the weelement...");
			System.out.println(e.getMessage());
		}
	}
	
	public void waitForelementPresent(By locator, int timeOut) {
		WebDriverWait wait =  new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public String waitForTitlePresenet(String title, int timeOut)
	{
		WebDriverWait wait =  new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	
	public String waitForTitleIS(String title, int timeOut)
	{
		WebDriverWait wait =  new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}
	/**
	 * This method will wait for the element to be clickable and then click on the element
	 * @param locator
	 * @param timeOut
	 */
	
	public void waitForElementToBeClickableAndClick(By locator, int timeOut)
	{
		WebDriverWait wait =  new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		driver.findElement(locator).click();
	}
	

}
