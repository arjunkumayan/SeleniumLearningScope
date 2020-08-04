package ASeleniumSessions;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingSSLCertifications {
	
	
	@BeforeClass
	public void setup() {
		
		// DesiredCapablities is a class which helps you to customize your chrome browser
		DesiredCapabilities ch = new DesiredCapabilities();
		ch.chrome();
		ch.acceptInsecureCerts();
		ch.setAcceptInsecureCerts(true);
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ch.setCapability(CapabilityType.BROWSER_VERSION, "82");
					
		ChromeOptions co = new ChromeOptions(); // to set your local browser setting
		co.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		co.setAcceptInsecureCerts(true);
		co.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
		
		co.merge(ch);
		
		System.setProperty("webdriver.chrome.driver", " ");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(co);
		
		
		
		
	}

}
