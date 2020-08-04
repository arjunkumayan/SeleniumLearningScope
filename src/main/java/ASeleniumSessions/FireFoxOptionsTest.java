package ASeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FireFoxOptionsTest {

	public static void main(String[] args) {
	
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.acceptInsecureCerts();
		
		FirefoxOptions options = new FirefoxOptions();
		options.setAcceptInsecureCerts(true);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		options.merge(dc);
		
		WebDriver driver = new FirefoxDriver(options);
		
		

	}

}
