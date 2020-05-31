package ASeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author asingh6766
 *
 */
public class DropDownHandle11 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		/*
		 * Select select = new Select(day);
		 * 
		 * select.selectByVisibleText("5");
		 * 
		 * Select select1 = new Select(month); select1.selectByVisibleText("May");
		 * 
		 * Select select2 = new Select(year); select2.selectByVisibleText("1996");
		 */
		
		//selectValueFromDropdown(day,"5");
		//selectValueFromDropdown(month,"May");
		//selectValueFromDropdown(year,"1995");
		
		//doselectValueByIndex(day, 8);
		//doselectValueByIndex(month, 5);
		//doselectValueByIndex(year, 9);
		
		
		doselectByValue(day, "7");
		doselectByValue(month, "10");
		doselectByValue(year, "2006");
	}
	
	/**
	 * this method is used to select the value from a drop down on the basis of given text
	 * @param element
	 * @param value
	 */
	public static void selectValueFromDropdown(WebElement element, String value)
	{
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	public static void doselectValueByIndex(WebElement element, int index)
	{
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public static void doselectByValue(WebElement element, String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}
	

}
