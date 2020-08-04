package durgaSoftware;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) {
	
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.get("https://login.yahoo.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		// Polymorphism concept
		// One interface can be refrenced by more than one class is called polymorphism
		
		

	}

}
