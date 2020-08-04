package ASeleniumSessions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandleInMap {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		

		driver.get("D:\\Users\\asingh6766\\eclipse-workspace\\SeleniumLearning\\src\\main\\java\\ASeleniumSessions\\webtable.html");
		
		String headerLoc = "//table[@class='tg']//tr[1]/th";
		
            List<WebElement> headerEle =driver.findElements(By.xpath(headerLoc));
            
            List<String> allHeaderNames = new ArrayList<String>();
            
            for(WebElement header:headerEle) {
            	String headerName = header.getText();
            	allHeaderNames.add(headerName);
            }
		
            
            List<LinkedHashMap<String, String>> allTableData = new ArrayList<LinkedHashMap<String,String>>();
            
            String rowLoc = "//table[@class='tg']//tr";
            
           List<WebElement> allRowEle= driver.findElements(By.xpath(rowLoc));
            
           for(int i=2; i<=allRowEle.size(); i++) {
        	   
        	   String specificRow = "//table[@class='tg']//tr["+i+"]";
        	   
        	   System.out.println(specificRow);
        	   
        	   WebElement eachRowData = driver.findElement(By.xpath(specificRow));
        	   
        	   
        	   List<WebElement> allColumnsEle = eachRowData.findElements(By.tagName("td"));
        	   
        	   
        	   LinkedHashMap<String,String> eachRowData1 = new LinkedHashMap<String, String>();
        	   
        	   
        	   for(int j=0; j<allColumnsEle.size() ; j++) {
        		String cellValue =  allColumnsEle.get(j).getText();
        		System.out.println(cellValue);
        		
        		eachRowData1.put(allHeaderNames.get(j), cellValue);
        		
        	   }
        	   
        	   allTableData.add(eachRowData1);
        	   
        	   System.out.println(allTableData.get(i));
        	   System.out.println(allTableData);
        	   
           }
            
           
           System.out.println(allTableData);
           
           
		
		
		
		
	}

}
