package NinjaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxProfileDemo {
	// about:profiles - type in the browser you will get all the profiles and its locations
	
	
	
	@Test
	public void testFireFox() {
		
		WebDriverManager.firefoxdriver().setup();
				
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile fxProfile = profile.getProfile("AutomationFirefoxtest");
		
		FirefoxOptions options = new FirefoxOptions();
		
		options.setProfile(fxProfile);
		
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		
	}

}
