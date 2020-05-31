package LoadTimeOutDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetPageLoadTimeOut {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
	
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS); //org.openqa.selenium.TimeoutException: timeout:
		
		driver.get("https://app.hubspot.com/");
		
		driver.quit();

	}

}
