package NJuly2019SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDrivermanagerConcept {

	public static void main(String[] args) {

		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.chromedriver().version("2.26").setup();	
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
