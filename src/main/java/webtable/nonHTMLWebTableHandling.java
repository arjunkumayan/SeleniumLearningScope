package webtable;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nonHTMLWebTableHandling {

	public static void main(String[] args) {
		// Get data from non table html tag webtable using selenium webdriver
		
		//div[contains(@class,'ui-grid-viewport')]//div[contains(@class,'grid-row')]
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/WebTable.html");
		
		//wait till web table is loaded
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[contains(@class,'ui-grid-viewport')]//div[contains(@class,'grid-row')]"), 1));

		List<String> allHeaderNames = new ArrayList<String>();
		
		String headerLoc = "//span[contains(@class,'ui-grid-header-cell-label')]";
		List<WebElement> allHeaderEle= driver.findElements(By.xpath(headerLoc));
		for(WebElement ele:allHeaderEle) {
			//System.out.println(ele.getText());
			String headerName = ele.getText();
			allHeaderNames.add(headerName);
		}
		
		System.out.println("Headers are ---");
		System.out.println(allHeaderNames);
		// Lets get header first
		/*
		 *  Each row will be a key value pair, wo we will use linkehashmap so that order can be retained
		 *  All map will be added to a list:
		 * 
		 */
		List<LinkedHashMap<String, String>> allTableData = new ArrayList<LinkedHashMap<String,String>>();
		
		// Get total rows count excluding headers
		
		String rowLoc ="//div[contains(@class,'ui-grid-row')]";
		
		List<WebElement> allRowsEle= driver.findElements(By.xpath(rowLoc));
		
		for(int i=1; i<=allRowsEle.size(); i++) {
			// Getting specific rows
			
			String specificRowLoc = "(//div[contains(@class,'ui-grid-row')])["+i+"]";
			
			List<WebElement> allColumnsEle= driver.findElement(By.xpath(specificRowLoc)).findElements(By.xpath(".//div[contains(@class,'ui-grid-cell-contents')]"));
			// Creating a map to store key values, it will be created for eadh iteration
			
			LinkedHashMap<String,String> eachRowData = new LinkedHashMap<String, String>();
			for(int j=0; j<allColumnsEle.size(); j++) {
				//getting cell value
				String cellValue = allColumnsEle.get(j).getText();
				System.out.println(cellValue);
				eachRowData.put(allHeaderNames.get(j), cellValue);
			}
			
			//after iterating data add row completely in the list
			
			allTableData.add(eachRowData);
		}
		
		
		System.out.println("Table Data are: ");
		System.out.println("-------------------");
		
		for(LinkedHashMap<String, String> data:allTableData) {
			
			for(String key:data.keySet()) {
				System.out.println(key+"   : " +data.get(key));
				
			}
			System.out.println("===========");
		}
		
		driver.quit();
		

	}

}
