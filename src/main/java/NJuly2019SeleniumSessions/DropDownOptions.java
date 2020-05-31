package NJuly2019SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptions {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");

		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com/");

		 By day = By.id("day");
		 By month = By.id("month");
		 By year = By.id("year");
		 
		ArrayList<String> dayOptions =  getAllOptions(driver, day);
		System.out.println("total days are: "+ dayOptions.size());
		if(dayOptions.size()==32){
			System.out.println("total number of days are correct");
		}
		else{
			System.out.println("total number of days are not correct");

		}
		//print:
		for(int i=0; i<dayOptions.size(); i++){
			System.out.println(dayOptions.get(i));
		}
		
		 getAllOptions(driver, month);
		 getAllOptions(driver, year);


//		WebElement day = driver.findElement(By.id("day"));
//		WebElement month = driver.findElement(By.id("month"));
//		WebElement year = driver.findElement(By.id("year"));
//
//		Select select1 = new Select(day);
//
//		List<WebElement> dayOptions = select1.getOptions();
//		System.out.println(dayOptions.size());
//
//		for (int i = 0; i < dayOptions.size(); i++) {
//			String text = dayOptions.get(i).getText();
//			System.out.println(text);
//		}
//
//		Select select2 = new Select(month);
//
//		List<WebElement> monthOptions = select2.getOptions();
//		System.out.println(monthOptions.size());
//
//		for (int i = 0; i < monthOptions.size(); i++) {
//			String text = monthOptions.get(i).getText();
//			System.out.println(text);
//		}
//
//		Select select3 = new Select(year);
//
//		List<WebElement> yearOptions = select3.getOptions();
//		System.out.println(yearOptions.size());
//
//		for (int i = 0; i < yearOptions.size(); i++) {
//			String text = yearOptions.get(i).getText();
//			System.out.println(text);
//		}

	}

	public static ArrayList<String> getAllOptions(WebDriver driver, By locator) {
		ArrayList<String> optionsList = new ArrayList<String>();
		WebElement element = getElement(driver, locator);
		
		Select select = new Select(element);
		List<WebElement> dropDownOptions = select.getOptions();
		
		//System.out.println(dropDownOptions.size());
		for (int i = 0; i < dropDownOptions.size(); i++) {
			String text = dropDownOptions.get(i).getText();
			//System.out.println(text);
			optionsList.add(text);
		}
		return optionsList;
	}

	/**
	 * used to create webelement on the basis of By locator
	 * 
	 * @param driver
	 * @param locator
	 * @return element
	 */
	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}

}
