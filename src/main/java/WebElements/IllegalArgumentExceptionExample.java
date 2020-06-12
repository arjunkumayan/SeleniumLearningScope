package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/* If you try to type something in to an input box and input string is either null or length of input string in zero
 * sendKeys() will throw an exception
 * As - IllegalArgumentException: keys to send should be a not null charsequence
 * If you see the implementation of sendKeys() method in RemotewebElement() then you can check that there are some conditions
 * specified before sending keys to webElement
 *  
 *  
 * 
 * 
 */

public class IllegalArgumentExceptionExample {
	
	@Test
	public void googleSearch() { //java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String inputString = null;
		
		driver.findElement(By.name("q")).sendKeys(inputString);
		
	}
	
	@Test
	public void googleSearch2() { // java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		// not passing any value in sendkeys	
		driver.findElement(By.name("q")).sendKeys();
		
	}
	
	@Test
	public void googleSearch3() { // java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		// not passing any value in sendkeys	
		driver.findElement(By.name("q")).sendKeys("");
		
	}
	
	

}
