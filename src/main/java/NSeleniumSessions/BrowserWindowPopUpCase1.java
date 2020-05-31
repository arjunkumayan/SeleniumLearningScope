package NSeleniumSessions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUpCase1 {
	
	
	public static WebElement createWebElement(WebDriver driver, By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void clickElement(WebDriver driver, By locator)
	{
		createWebElement(driver, locator).click();
		
	}
	
	public static void clickElement(WebDriver driver, String text)
	{
		By linktext = By.linkText(text);
		WebElement element  = driver.findElement(linktext);
		element.click();
	}
	
	public static void clickPopLink(WebDriver driver, By locator)
	{
		clickElement(driver, locator);
		Set<String> handles= driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowID = it.next();
		
		String childWindowID = it.next();
		
		String parentTitle = driver.getTitle();
		System.out.println("Parent title is: "+parentTitle);
		
		driver.switchTo().window(childWindowID);
		
		System.out.println("Child window title : "+driver.getTitle());
		
		driver.close();
		driver.switchTo().window(parentWindowID);
		
		System.out.println("Again parent window id is: "+driver.getTitle());
		
		
	}

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		By popupLinktext1 = By.linkText("Good PopUp #1");
		By popupLinktext2 = By.linkText("Good PopUp #2"); 
		By popupLinktext3 = By.linkText("Good PopUp #3"); 
		By popupLinktext4 = By.linkText("Good PopUp #4");
		
				
		WebElement element = driver.findElement(popupLinktext1);
		
		System.out.println("count of links: "+driver.findElements(By.tagName("a")).size());
		
		List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
		
		for(int i = 1 ;i<listOfLinks.size() ; i++)
		{
			String txt = listOfLinks.get(i).getText();
			clickElement(driver, txt);
			
		}
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it =handles.iterator();
		
		while(it.hasNext())
		{
			String wId=it.next();
			driver.switchTo().window(wId);
			System.out.println(driver.getTitle());
		}
		//System.out.println("popup first link text = "+element.getText());
		
//		ArrayList<Object> list = new ArrayList<>();
//		list.add(popupLinktext1);
//		list.add(popupLinktext2);
//		list.add(popupLinktext3);
//		list.add(popupLinktext4);
		
		
		
		
		
	
		
		   
	}

}
