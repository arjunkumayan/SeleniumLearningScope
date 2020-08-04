package DropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownVerify {
	
	@Test
	public void verifydropDownValues() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
		
		Select tools = new Select(driver.findElement(By.id("tools")));
		
		List actualList = new ArrayList<String>();
		
		List<WebElement> myTools = tools.getOptions();
		
		for(WebElement ele : myTools) {			
			String data = ele.getText();
		    actualList.add(data);
			
		}
		
		List tempList = new ArrayList<String>();
		tempList.addAll(actualList);
		// Ascending order
		Collections.sort(tempList);
		
		// Descending order
		//Collections.sort(tempList,Collections.reverseOrder());
		
		Assert.assertTrue(actualList.equals(tempList));
		
		
	}

}
