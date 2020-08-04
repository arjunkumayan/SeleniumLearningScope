package SeleniumHierarchy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsCase1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		System.out.println("parent window title: "+ driver.getTitle());
		
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		System.out.println("Clicked on child link popup 3 but not switch to child window title: "+ driver.getTitle());
		
		driver.findElement(By.linkText("Good PopUp #4")).click();
		System.out.println("Clicked on child link popup 4 but not switch to child window title: "+ driver.getTitle());

		Set<String> windowHandles = driver.getWindowHandles();
		
		Iterator<String> it = windowHandles.iterator();
		
		String parentWindow = it.next();
	    System.out.println("Parent window id is: "+parentWindow);
	
	    String child1 = it.next();
	    String child2 = it.next();
		System.out.println("child1 window id is: "+child1);
		driver.switchTo().window(child1);
		System.out.println("Switched to Child 1 window id is: "+driver.getTitle());
		System.out.println(driver.getCurrentUrl());	
		
		if(driver.getCurrentUrl().equalsIgnoreCase("http://www.popuptest.com/popup4.html")) {
			System.out.println("Child1 url pass");
		}
		else {
			System.out.println("child1 url failed");
		}
		
		driver.close();
	   // String child2 = it.next();
		System.out.println("child2 window id is: "+child2);
		driver.switchTo().window(child2);
		System.out.println("Switched to Child 2 window id is: "+driver.getTitle());
		System.out.println(driver.getCurrentUrl());		
		if(driver.getCurrentUrl().equalsIgnoreCase("http://www.popuptest.com/popup3.html")) {
			System.out.println("Child2 url pass");
		}
		else {
			System.out.println("child2 url failed");
		}
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println("PArent window title is: "+driver.getTitle());
	}

}
