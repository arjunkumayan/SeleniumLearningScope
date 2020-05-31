package N2020SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithSelect {

	public static void main(String[] args) {

		//select html tag based drop downs
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select select = new Select(day);
		select.selectByVisibleText("15");
		select.selectByIndex(5);
		select.selectByValue("9");
		
		System.out.println(select.isMultiple());
		

		getDropDownValues(day);
		getDropDownValues(month);
		getDropDownValues(year);
		
//		
//		Select select1 = new Select(month);
//		select1.selectByVisibleText("Jun");
//		
//		Select select2 = new Select(year);
//		select2.selectByVisibleText("1990");
		
//		selectDropDown(day, "5");
//		selectDropDown(month, "Feb");
//		selectDropDown(year, "2005");

	}
	
	
	public static void getDropDownValues(WebElement element){
		Select select = new Select(element);
		List<WebElement> optionsList = select.getOptions();
		System.out.println("total values in drop down: "+ optionsList.size());
		for(int i=0; i<optionsList.size(); i++){
			System.out.println(optionsList.get(i).getText());
		}
	}
	
	
	public static void selectDropDown(WebElement element, String value){
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
	}
	
	public static void selectDropDown(WebElement element, int index){
		Select select = new Select(element);
		select.selectByIndex(index);
	}

}
