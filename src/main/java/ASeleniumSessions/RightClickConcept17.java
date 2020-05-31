package ASeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept17 {
	
	@Test
	public void verifyRightDropDownValues()
	{
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions action = new Actions(driver);
		WebElement  rightClickElement = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));

		action.moveToElement(rightClickElement).contextClick().build().perform();
		
		
		// print all options displayed on right click
		
		By rightClickOption = By.xpath("//span[contains(text(),'Copy')]//parent::li/parent::ul/li/span");
		/*
		 * List<WebElement> rightOptions = driver.findElements(rightClickOption);
		 * 
		 * System.out.println(rightOptions.size());
		 * 
		 * ArrayList<String> alist = new ArrayList<String>();
		 * 
		 * for(WebElement ele : rightOptions) { String text =ele.getText();
		 * alist.add(text); // System.out.println(text);
		 * 
		 * }
		 */
		
		ArrayList<String> rightClickOptions = getOptions(driver, rightClickOption);
		
		ListIterator<String> itr = rightClickOptions.listIterator();
	
		while(itr.hasNext())
		{
			String text =itr.next();
		    System.out.println(text);
		}
		
		System.out.println("Assertion");
		Assert.assertTrue(getOptions(driver, rightClickOption).equals(expectedList()));
		
	}
	
	public static ArrayList<String> getOptions(WebDriver driver, By locator)
	{
		
       List<WebElement> rightOptions =	driver.findElements(locator);
		
		System.out.println(rightOptions.size());
		
		ArrayList<String> alist = new ArrayList<String>();
		
		for(WebElement ele : rightOptions)
		{
		String text =ele.getText();
		alist.add(text);
	//	System.out.println(text);
		
		}
		
		return alist;
	}

	
	public static ArrayList<String> expectedList()
	{
		ArrayList<String> elist = new ArrayList<String>();
		elist.add("Edit");
		elist.add("Cut");
		elist.add("Copy");
		elist.add("Paste");
		elist.add("Delete");
		elist.add("Quit");
		
		return elist;
		
	}
}
