package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleHiddenElements {
	// ElementNotVisibleException - Element is not visible and so not able to interact with
	// hiddent elements are those elements which are having type= hidden
	
	@Test // Using getLocation concept of coordinate
	public void FFHiddenElements() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
		//driver.findElement(By.id("male")).click();  // it will ElementNotVisibleException because it has two attribute id = male but first element type is hidden
		
		// How to solve it get the 
		
		int x = driver.findElement(By.id("male")).getLocation().getX();
		int y = driver.findElement(By.id("male")).getLocation().getY();
		
		System.out.println("X cordinates: "+x); // it will be 0 because hidden elements coordinates are always zero
		System.out.println("Y cordinates: "+y); // it will be 0 because hidden elements coordinates are always zero
		
		// then how to solve it with the help of findElements() concept
		
		List<WebElement> radio =driver.findElements(By.id("male"));
		
		int count = radio.size();
		System.out.println("total radio buttons: "+ count);
		
		for(int i =0 ;i<radio.size() ; i++) {
			
		WebElement ele =radio.get(i);
		
		int xCord = ele.getLocation().getX();
		
		if(xCord!=0) {
			ele.click();
			break;
			
		}
			
			
		}
		
		
	}
	
	

}
