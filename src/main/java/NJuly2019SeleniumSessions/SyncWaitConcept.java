package NJuly2019SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyncWaitConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://app.hubspot.com/login");
		
		//Thread.sleep(15000);
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		
		
		
		
	}

}
