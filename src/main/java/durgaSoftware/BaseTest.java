package durgaSoftware;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static String projectPath =System.getProperty("user.dir");
	public static String propPath = ".//src//main//java//durgaSoftware//data.properties";
	public static Properties prop;
	public static Properties prop1;
	public static Properties prop2;
	
	public static void init() throws IOException {
		FileInputStream fis = new FileInputStream(propPath);
		prop = new Properties();
		prop.load(fis);
		
		fis = new FileInputStream(".//src//main//java//durgaSoftware//environment.properties");
		prop1 = new Properties();
		prop1.load(fis);
		String env= prop1.getProperty("env");
		System.out.println(prop1.getProperty("env"));
		
		fis= new FileInputStream(".//src//main//java//durgaSoftware//"+env+".properties");
		prop2 = new Properties();
		prop2.load(fis);
		System.out.println(prop2.getProperty("amazonurl"));
		
	}
	
	public static void launch(String browser) {

		if (prop.getProperty(browser).equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} 
		
		else if (prop.getProperty(browser).equalsIgnoreCase("firefox")) {
			
			ProfilesIni p = new ProfilesIni();
			FirefoxProfile profile = p.getProfile("JulyFFProfile");
			
			FirefoxOptions option = new FirefoxOptions();
			option.setProfile(profile);
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(option);
		}

	}
	
	public static void navigateUrl(String url) {
		driver.get(prop.getProperty(url));
	}
	public static void navigateUrl1(String url) {
		driver.get(prop.getProperty(url));
	}

}
