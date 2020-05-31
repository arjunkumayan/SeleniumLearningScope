package ASeleniumSessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOrder13 {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void verifySelectDropdownValue()
	{
		
		ArrayList<String> actual = getDropdownValues(driver);
		System.out.println("actual"+ actual);
		ArrayList<String> expected = createExpectedOptionsList(driver);
		System.out.println("Expected"+ expected);
		
		Assert.assertTrue(actual.equals(expected));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
	
	public static ArrayList<String> getDropdownValues(WebDriver driver)
	{
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select select = new Select(day);
		List<WebElement> listOptions =select.getOptions();
		
		ArrayList<String> actualList =  new ArrayList<String>();
		
		for(WebElement element : listOptions)
		{
			actualList.add(element.getText());
			//System.out.println("actual: "+ actualList);
		}
		return actualList;
	}
	
	public static ArrayList<String> createExpectedOptionsList(WebDriver driver)
	{
		ArrayList<String> expectedList =  new ArrayList<String>();
		expectedList.addAll(getDropdownValues(driver));
	//	System.out.println("expected: "+ expectedList);
		Collections.sort(expectedList);
		return expectedList;
		
	}
	
	

}
