package SeleniumHierarchy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEventsDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
 try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
		
 Actions action = new Actions(driver);
 
 WebElement username = driver.findElement(By.id("userName"));
 
 WebElement userName = driver.findElement(By.id("userName"));
 WebElement currAddr = driver.findElement(By.id("currentAddress"));
 WebElement perAddr = driver.findElement(By.id("permanentAddress")); 
 WebElement submitButton = driver.findElement(By.id("submit"));

 
 //action.keyDown(username, Keys.SHIFT).sendKeys("arjun").keyUp(Keys.SHIFT).build().perform();
 
 action.sendKeys(userName,"john").build().perform();
 
 action.sendKeys(currAddr,"hello 123").build().perform();
 
 action.keyDown(currAddr,Keys.CONTROL).sendKeys("a").build().perform();
 action.keyDown(currAddr,Keys.CONTROL).sendKeys("c").build().perform();
 
 action.keyDown(perAddr, Keys.CONTROL).sendKeys("v").build().perform();
 
		
	}

}
