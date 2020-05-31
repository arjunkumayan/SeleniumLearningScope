package ASeleniumSessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleCase3 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		System.out.println("parent window title: "+ driver.getTitle());
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		Set<String> handles = driver.getWindowHandles();
		
		// convert set to list
		
		List<String> list = new ArrayList<String>();
		for(String l: handles)
		{
			list.add(l);
			
		}
		
		
		
		/*
		 * Iterator<String> itr = handles.iterator();
		 * 
		 * String parentId = itr.next(); System.out.println(parentId);
		 * 
		 * String childId = itr.next(); System.out.println(childId);
		 * 
		 * driver.switchTo().window(childId);
		 * System.out.println(" ----- Switched to child windows 1------");
		 * System.out.println("child title: "+ driver.getTitle()); driver.close();
		 * driver.switchTo().window(parentId);
		 * System.out.println(" ----- Switched back to parent windows 1------");
		 * 
		 * System.out.println(driver.getTitle());
		 * 
		 * // 2nd click
		 * 
		 * driver.findElement(By.linkText("Good PopUp #4")).click(); Set<String>
		 * handles2 = driver.getWindowHandles();
		 * 
		 * Iterator<String> itr2 = handles2.iterator();
		 * 
		 * String parentId1 = itr2.next(); System.out.println(parentId1);
		 * 
		 * String childId2 = itr2.next(); System.out.println(childId2);
		 * 
		 * driver.switchTo().window(childId2);
		 * System.out.println(" ----- Switched to child windows 2------");
		 * System.out.println("childId2 title: "+ driver.getTitle()); driver.close();
		 * driver.switchTo().window(parentId1);
		 * System.out.println(" ----- Switched back to parent windows 2------");
		 * driver.close();
		 */
		
		
		
	}
	
	public static <T> List<T> converSetToList(Set<T> set)
	{
		
		List<T> list = new ArrayList<T>();
		
		for(T l:set)
		{
			list.add(l);
		}
		return list;
	}

}
