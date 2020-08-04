package NinjaSelenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptiosDemo {
	
	public static void main(String[] args) {
	String baseURL = "https://www.google.com/";
	
	WebDriver driver;
	
	WebDriverManager.chromedriver().setup();
	
	ChromeOptions options = new ChromeOptions();
	options.addExtensions(new File("D:\\Users\\asingh6766\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\jjkchpdmjjdmalgembblgafllbpcjlei\\10.6.0.1_0.crx"));
	driver = new ChromeDriver(options);
		
	driver.get(baseURL);	
	}
	

}
