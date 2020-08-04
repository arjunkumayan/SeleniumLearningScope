package ASeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect12 {

	public static void main(String[] args) {
		
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		String day="//select[@id='day']/option";
		String month="//select[@id='month']/option";
		String year="//select[@id='year']/option";
		
		DropDownUtil.selectDropDownValueWithoutSelect(driver, day, "25");
		DropDownUtil.selectDropDownValueWithoutSelect(driver, month, "May");
		DropDownUtil.selectDropDownValueWithoutSelect(driver, year, "1995");
		
		/*
		 * List<WebElement> daysList =
		 * driver.findElements(By.xpath("//select[@id='day']/option"));
		 * 
		 * System.out.println(daysList.size());
		 * 
		 * for(int i=0; i<daysList.size() ; i++) { String text =
		 * daysList.get(i).getText(); System.out.println(text); if(text.equals("10")) {
		 * daysList.get(i).click(); break; } }
		 */
	}
	
	

}
