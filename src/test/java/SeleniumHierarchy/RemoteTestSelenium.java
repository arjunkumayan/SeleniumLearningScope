package SeleniumHierarchy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteTestSelenium {

	public static void main(String[] args) {
		
		
		//DesiredCapabilities
		
		DesiredCapabilities dc  = new DesiredCapabilities();
		
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WIN10);
		dc.setAcceptInsecureCerts(true);
		
		
		
		try {
			WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"),dc);
		  driver.get("");
		} catch (MalformedURLException e) {
		
			e.printStackTrace();
		}
		
		
		// properties of test
		
		

	}

}
