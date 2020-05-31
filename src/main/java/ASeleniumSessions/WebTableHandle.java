package ASeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--incognito");
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		int rowCount = getTableRowCount(driver);
		
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]

		//*[@id="customers"]/tbody/tr[3]/td[2]
		
		String beforeXpath = "//*[@id=\"customers\"]/tbody/tr[";
		
		String afterXpathCompany = "]/td[1]";
		String afterXpathContact = "]/td[2]";
		String afterXpathCountry = "]/td[3]";
		
		getColumnData(driver,beforeXpath,afterXpathCompany);
		getColumnData(driver,beforeXpath,afterXpathContact);
		getColumnData(driver,beforeXpath,afterXpathCountry);
		
		System.out.println("******");
		
		getCellData(driver, beforeXpath, 2);
		
		driver.quit();
		
	}

	/**
	 * @param driver
	 * @return
	 */
	public static int getTableRowCount(WebDriver driver)
	{
		List<WebElement> rowList = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int rowCount = rowList.size();
		//System.out.println(rowCount);
		return rowCount;
	}
	
	public static ArrayList<String> getColumnDataAddToList(WebDriver driver, String beforeXpath, String afterXpath)
	{
		ArrayList<String> data = new ArrayList<String>();
		
		for(int rowNum = 2; rowNum<=getTableRowCount(driver); rowNum++)
		{
			String actualXpath = beforeXpath+rowNum+afterXpath;
			//System.out.println(actualXpath);
			String text= driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(text);
			data.add(text);
		
		}
		return data;
	}
	
	public static void  getColumnData(WebDriver driver, String beforeXpath, String afterXpath)
	{
		for(int rowNum = 2; rowNum<=getTableRowCount(driver); rowNum++)
		{
			String actualXpath = beforeXpath+rowNum+afterXpath;
			//System.out.println(actualXpath);
			String text= driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(text);
		
		}
		
	}
	public static void  getCellData(WebDriver driver, String beforeXpath, int columnName)
	{
		String afterXpathForColumn = "]/td["+columnName+"]";
		for(int rowNum = 2; rowNum<=getTableRowCount(driver); rowNum++)
		{
			String actualXpath = beforeXpath+rowNum+afterXpathForColumn;
			//System.out.println(actualXpath);
			String text= driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(text);
		
		}
		
	}
}
