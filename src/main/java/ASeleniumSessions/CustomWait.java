package ASeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.get("http://classic.crmpro.com");
		
		By username = By.name("username");
		By password = By.name("password");
		By LoginButton = By.xpath("//input[@value='Login']");
		
		getElementWithWait(driver, username, 15).sendKeys("arjunkumayan18@gmail.com");
	}

	public static WebElement getElementWithWait(WebDriver driver, By locator, int timeout)
	{
		WebElement element = null;
		for(int i=0; i<timeout; i++)
		{
			try
			{
			element=driver.findElement(locator);
			break;
			}
			catch(Exception e)
			{
				System.out.println("waiting for element to be present -->"+i+ "secs");
				
				try {
					Thread.sleep(1000);
				}
				catch (InterruptedException e1) {
				}
				
				
			}
		}
		
		return element;
			
	}
	public static Boolean isElementDisplayed(WebDriver driver, By locator, int timeout)
	{
		WebElement element = null;
		boolean flag=false;
		for(int i=0; i<timeout; i++)
		{
			try
			{
			element=driver.findElement(locator);
			flag=element.isDisplayed();
			break;
			}
			catch(Exception e)
			{
				System.out.println("waiting for element to be present -->"+i+ "secs");
				
				try {
					Thread.sleep(1000);
				}
				catch (InterruptedException e1) {
				}
				
				
			}
		}
		
		return flag;
			
	}
	
	public static Boolean isElementSelected(WebDriver driver, By locator, int timeout)
	{
		WebElement element = null;
		boolean flag=false;
		for(int i=0; i<timeout; i++)
		{
			try
			{
			element=driver.findElement(locator);
			flag=element.isSelected();
			break;
			}
			catch(Exception e)
			{
				System.out.println("waiting for element to be present -->"+i+ "secs");
				
				try {
					Thread.sleep(1000);
				}
				catch (InterruptedException e1) {
				}
				
				
			}
		}
		
		return flag;
			
	}
	public static Boolean isElementEnabled(WebDriver driver, By locator, int timeout)
	{
		WebElement element = null;
		boolean flag=false;
		for(int i=0; i<timeout; i++)
		{
			try
			{
			element=driver.findElement(locator);
			flag=element.isEnabled();
			break;
			}
			catch(Exception e)
			{
				System.out.println("waiting for element to be present -->"+i+ "secs");
				
				try {
					Thread.sleep(1000);
				}
				catch (InterruptedException e1) {
				}
				
				
			}
		}
		
		return flag;
			
	}
}
