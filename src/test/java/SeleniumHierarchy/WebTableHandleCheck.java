package SeleniumHierarchy;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandleCheck {
	
	public static int getTotalrowCount(WebDriver driver) {		
		List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		return tableRows.size();
	}
	
	public static List<String> getColumnDataAddtoList(WebDriver driver,String beforeXpath, String afterxpath) {
		
		List<String> data = new ArrayList<>();
		
	
		
		for(int i=2; i<=getTotalrowCount(driver); i++) {
			String actual = beforeXpath+i+afterxpath;
			String text = driver.findElement(By.xpath(actual)).getText();
			
			data.add(text);
			
		}
		
		return data;
		
		
	}

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--incognito");
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//table[@id='customers']//tr[5]/td[1]
		//table[@id='customers']//tr[6]/td[1]
		//table[@id='customers']//tr[7]/td[1]
		
		String beforeXpath = "//table[@id='customers']//tr[";
		String afterXpath = "]/td[1]";
		//table[@id='customers']//tr[2]/td[1]
		
		for(int i=2; i<=7; i++) {
			
			String full = beforeXpath+i+afterXpath;
			String te = driver.findElement(By.xpath(full)).getText();
			System.out.println(te);
			
		}
		
		System.out.println(getTotalrowCount(driver));
		

	}

}
