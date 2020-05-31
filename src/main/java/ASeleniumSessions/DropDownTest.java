package ASeleniumSessions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		String date ="20_Dec_1996"; 
		String dateVal[] = date.split("_");
		
		
		ArrayList<String> dayList = DropDownUtil.getDropDownValues(day);
		System.out.println(dayList);
		
		ArrayList<String> monthList = DropDownUtil.getDropDownValues(month);
     	System.out.println(monthList);
     	
		ArrayList<String> yearList =DropDownUtil.getDropDownValues(year);
		System.out.println(yearList);
		
		
		DropDownUtil.selectValueFromDropdownByText(day, dateVal[0]);
		DropDownUtil.selectValueFromDropdownByText(month, dateVal[1]);
		DropDownUtil.selectValueFromDropdownByText(year, dateVal[2]);
		
		
		
		  Select select = new Select(day); 
		  //select.deselectByVisibleText(" ");
		  select.getFirstSelectedOption();
		  
		 System.out.println(select.isMultiple());
		// Select class to used when only the select class is available
		 
	}

}
