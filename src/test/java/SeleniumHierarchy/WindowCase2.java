package SeleniumHierarchy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowCase2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		System.out.println("parent window title: "+ driver.getTitle());
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> windowsHandles = driver.getWindowHandles();
		Iterator<String> it = windowsHandles.iterator();
		String parentID = it.next();
		System.out.println(parentID);
		String child1 = it.next();
		
		driver.switchTo().window(child1);
		
		System.out.println("Moved to first child window");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentID);
		driver.findElement(By.linkText("Good PopUp #4")).click();
		Set<String> windowsHandles1 = driver.getWindowHandles();
		Iterator<String> it2 = windowsHandles1.iterator();
		String parentID1 = it2.next();
		String child2 = it2.next();
		driver.switchTo().window(child2);
		System.out.println("Moved to second child window");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentID1);
		driver.close();
		

	}
	public static <T> List<T> convertSetToList(Set<T> set) {
		ArrayList<T> list = new ArrayList<>();
		
		set.forEach(values ->{
			
			list.add(values);
		});
	  return list;
	
		
	}
	
	public static <T> List<T> convertSetToList1(Set<T> set) {
		ArrayList<T> list = new ArrayList<>();
		
		for(T t:set) {
			list.add(t);
		}
	  return list;
	
		
	}
	
	public static <T> List<T> convertSetToList3(Set<T> set) {
		
		List<T> list = new ArrayList<T>(set);
		return list;
		
	}
	
public static <T> List<T> convertSetToList4(Set<T> set) {
		
		List<T> list = new ArrayList<T>(set);
		
	for(T s:set) {
		list.add(s);
	}
		return list;
		
	}

}
