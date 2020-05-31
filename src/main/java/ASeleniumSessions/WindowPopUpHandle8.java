package ASeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopUpHandle8 {

	public static void main(String[] args) {

		// Windows based pop up handle
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		System.out.println("parent window title: "+ driver.getTitle());
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> itr= handles.iterator();
		
		
		// iterator is used to get the object for which the index is not maintained
		
		// Set<String> - One set object is created - it does not maintain the order and does not add duplicates
		
		// it will create two memory allocation and does not store on the basis of index and can not hold any duplicates values
		// parent PID - 
		// child CHID - 
		
		// interview questions - why driver.getWindowHandles() - return only the Set<String> because the properties of set is that is does not store the duplicate objects and doe not maintain any order
		
		String parentId = itr.next();
		System.out.println("parent window id is: "+ parentId);
		
		String childId = itr.next();
		System.out.println("child window id is: "+ childId);
		
		driver.switchTo().window(childId); // switched to child window
		System.out.println("child windos title: "+ driver.getTitle());
		
	    driver.close(); // only the focused browser will be closed
	    
	    driver.switchTo().window(parentId); // switched back to parent window
	    System.out.println("after closing the child window and switched back to parent window the tile is:"+ driver.getTitle());
	
	    
	     driver.quit(); // terminate the session
	
	}

}
