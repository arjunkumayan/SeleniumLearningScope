package NJuly2019SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigateTo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		//driver.get("http://www.amazon.com");
		driver.navigate().to("http://www.amazon.com");
		
		System.out.println(driver.getTitle());
		
	}

}
