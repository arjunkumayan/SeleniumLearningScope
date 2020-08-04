package SeleniumHierarchy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandleTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		//PopupTest Friday July, 03 2020
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();
		
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		System.out.println("Switched to child window");
		if(driver.getTitle().equals("PopupTest Friday July, 03 2020")) {
			System.out.println("Child window Pass");
			
		}
		else {
			System.out.println("fail");
		}
		driver.close();
		driver.switchTo().window(parent);
		System.out.println("Switched back to parent window");
		if(driver.getTitle().equals("PopupTest - test your popup killer software")) {
			System.out.println("Parent window Pass");
			
		}
		else {
			System.out.println("fail");
		}
		
//		while(it.hasNext()) {
//			String parent = it.next();
//			System.out.println(parent);
//		}

	}

}
