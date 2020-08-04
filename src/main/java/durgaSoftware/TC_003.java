package durgaSoftware;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_003 {

	
	public static void main(String[] args) {
		
		 //  System.setProperty("webdriver.gecko.driver", ".//src//main//java//durgaSoftware//geckodriver.exe");
		    WebDriverManager.firefoxdriver().setup();
			
			ProfilesIni p = new ProfilesIni();
			//p.getProfile("JulyFFProfile");
			FirefoxProfile profile = new FirefoxProfile();
					
			profile.setPreference("dom.webnotifications.enabled", false);
			
		 	FirefoxOptions option = new FirefoxOptions();
			option.setProfile(profile);
			
			
			 WebDriver driver  = new FirefoxDriver(option);
			
			driver.get("https://www.axisbank.com/");
		
			System.out.println(driver.getTitle());


	}

}
