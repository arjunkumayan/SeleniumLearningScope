package ASeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtil {
	
	public static ArrayList<String> getDropDownValues(WebElement element)
	{
		//System.out.println("===============");
		Select select  = new Select(element);
		List<WebElement>  dropList = select.getOptions();
		//System.out.println("Total days: "+ dropList.size());
		
		ArrayList<String> ar =new ArrayList<String>();
		for(int i=0; i<dropList.size(); i++)
		{
			ar.add(dropList.get(i).getText());
			//System.out.println(text);
		}
		
		return ar;
	}
	
	public static void selectValueFromDropdownByText(WebElement element, String value)
	{
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	public static void selectValueFromDropdownByIndex(WebElement element, int index)
	{
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public static void selectValueFromDropdownByValue(WebElement element, String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}

	/**
	 * this method is used to select the values from drop down without select class
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void selectDropDownValueWithoutSelect(WebDriver driver, String locator, String value)
	{
       List<WebElement> dropList = driver.findElements(By.xpath(locator));
		
		System.out.println(dropList.size());
		
		for(int i=0; i<dropList.size() ; i++)
		{
			String text = dropList.get(i).getText();
			//System.out.println(text);
			if(text.equals(value))
			{
				dropList.get(i).click();
				break;
			}
		}
	}
}
