package SeleniumExceptionsList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IllegalStateDemo {
	// this happens if path to the driver executable is not set
	@Test
	public void test() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
	}
	//	java.lang.IllegalStateException: The path to the driver executable must be set by the webdriver.chrome.driver system property; for more information, see https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver. The latest version can be downloaded from http://chromedriver.storage.googleapis.com/index.html

}
