package ASeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeProfileConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("user-data-dir=D:\\Users\\asingh6766\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
		co.addArguments("--disable-notifications");
		//co.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.google.com");

	}

}
