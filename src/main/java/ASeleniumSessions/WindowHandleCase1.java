package ASeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleCase1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		System.out.println("parent window title: "+ driver.getTitle());
				
		driver.findElement(By.linkText("Good PopUp #3")).click();
		System.out.println("Clicked on child link popup 3 but not switch to child window title: "+ driver.getTitle());
		
		driver.findElement(By.linkText("Good PopUp #4")).click();
		System.out.println("Clicked on child link popup 4 but not switch to child window title: "+ driver.getTitle());
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> itr= handles.iterator();
		String childWindowID = null;
		/*
		 * while(itr.hasNext()) { childWindowID = itr.next();
		 * System.out.println(childWindowID);
		 * 
		 * driver.switchTo().window(childWindowID);
		 * System.out.println("Child window title: " + driver.getTitle());
		 * driver.close(); childWindowID = itr.next();
		 * driver.switchTo().window(childWindowID); }
		 */
		//
		String parentID = itr.next();
		
		System.out.println("Parent window id is: " + parentID);
		
		//1. Child Window 1
		
		String childID1 = itr.next();
		String childID2 = itr.next();
		driver.switchTo().window(childID1);
		
		System.out.println("child window id is: " + childID1);
		System.out.println(" First child window title: "+ driver.getTitle());
		driver.close();
		
		//2. Child Window 2
		//String childID2 = itr.next();
		System.out.println("child window id is: " + childID2);
		driver.switchTo().window(childID2);
		System.out.println(" Second child window title: "+ driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentID);
		System.out.println("again back to parent window: "+ driver.getTitle());
		
		driver.close();
		
	}

}
