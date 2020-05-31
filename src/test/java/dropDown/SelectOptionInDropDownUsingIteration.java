package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectOptionInDropDownUsingIteration {
	
	
	@Test
	public void iterateOverOptions() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Select day
		
		WebElement day = driver.findElement(By.id("day"));
		day.click();
	    List<WebElement> allDayDropDownOptions = driver.findElements(By.xpath("//select[@id='day']/option"));
	    selectOptionDropDownUsingIteration(allDayDropDownOptions, "3");
	    
	    
	    // Select month
	    WebElement month = driver.findElement(By.id("month"));
		day.click();
	    List<WebElement> allMonthDropDownOptions = driver.findElements(By.xpath("//select[@id='month']/option"));
	    selectOptionDropDownUsingIteration(allMonthDropDownOptions, "Aug");
	    
	    // Select Year
	    WebElement year = driver.findElement(By.id("day"));
		day.click();
	    List<WebElement> allYearDropDownOptions = driver.findElements(By.xpath("//select[@id='year']/option"));
	    selectOptionDropDownUsingIteration(allYearDropDownOptions, "1980");
	    
	    
	}
	
	private void selectOptionDropDownUsingIteration(List<WebElement> dropDownOptions, String optionToBeSelected) {
		
		boolean isFound = false;
		
		for(WebElement option: dropDownOptions) {
			if(option.getText().equalsIgnoreCase(optionToBeSelected)) {
				option.click();
				isFound = true;
				break;
			}
			
			
		}
		
		if(!isFound) {
			System.out.println(" No Matching option found. ");
		}
	}
	

	

}
