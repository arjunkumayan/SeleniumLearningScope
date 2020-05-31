package NJuly2019SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshPage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement login = driver.findElement(By.id("login1"));
		
		driver.navigate().refresh();
				
		//login = driver.findElement(By.id("login1"));
				
		login.sendKeys("test@rediff.com");
		
		
		
		
		
		
	}

}
