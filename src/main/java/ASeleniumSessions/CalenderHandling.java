package ASeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandling {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.skyscanner.co.in");
		WebElement  dropdownElement = driver.findElement(By.id("depart-fsc-datepicker-button"));
		dropdownElement.click();
		driver.findElement(By.id("depart-calendar__bpk_calendar_nav_select")).click();
		
		Select select =  new Select(driver.findElement(By.id("depart-calendar__bpk_calendar_nav_select")));
		
		select.selectByVisibleText("May 2020");
		
	}

}
