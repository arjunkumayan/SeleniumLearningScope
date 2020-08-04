package SeleniumHierarchy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxProfileTest {
	
	public static WebDriver driver = null;
	
	
	@BeforeClass
	public void setup() {
		WebDriverManager.firefoxdriver().setup();
	  //ProfilesIni pro = new ProfilesIni();
	   //pro.getProfile("default");
	
		FirefoxProfile firefoProfile = new FirefoxProfile();
		//firefoProfile.setPreference(key, value);
		firefoProfile.setAcceptUntrustedCertificates(true);
		//firefoProfile.setAlwaysLoadNoFocusLib(100);
		firefoProfile.setAssumeUntrustedCertificateIssuer(true);
		
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(firefoProfile);
		options.setAcceptInsecureCerts(true);
		
	//	options.setHeadless("--headless");
	
		driver = new FirefoxDriver(options);
		
		
		
	}

}
