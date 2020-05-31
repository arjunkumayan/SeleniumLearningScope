package ASeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept5 {

	public static void main(String[] args) {

		// Webdriver api provided by bornigarcia
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		
		driver.get("https://www.amazon.in");
		
		System.out.println(driver.getTitle());
		
		
	}

}
