package NJuly2019SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		
		selectDropDownValueByVisibleText(driver, day, "10");
		selectDropDownValueByVisibleText(driver, month, "May");
		selectDropDownValueByVisibleText(driver, year, "1990");
		
		selectDropDownValueByIndex(driver, month, 8);
		
		
		//WebElement dayElement = driver.findElement(By.id("day"));
//		WebElement month = driver.findElement(By.id("month"));
//		WebElement year = driver.findElement(By.id("year"));

		//Select select1 = new Select(dayElement);
		//select1.selectByIndex(4);
//		select1.selectByVisibleText("10");
//		
//		Select select2 = new Select(month);
//		select2.selectByVisibleText("May");
//		
//		Select select3 = new Select(year);
//		select3.selectByVisibleText("1990");	
		
		
	}
	
	/**
	 * this is used to select the values from drop down on the basis of visible text
	 * @param element
	 * @param value
	 */
	public static void selectDropDownValueByVisibleText(WebDriver driver, By locator, String value){
		WebElement element = getElement(driver, locator);
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @param index
	 */
	public static void selectDropDownValueByIndex(WebDriver driver, By locator, int index){
		WebElement element = getElement(driver, locator);
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	/**
	 * used to create webelement on the basis of By locator
	 * @param driver
	 * @param locator
	 * @return element
	 */
	public static WebElement getElement(WebDriver driver, By locator){
		WebElement element = driver.findElement(locator);
		return element;
	}

}
