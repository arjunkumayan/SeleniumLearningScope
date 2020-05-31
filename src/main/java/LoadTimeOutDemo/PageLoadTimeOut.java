package LoadTimeOutDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadTimeOut {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
			
		 //org.openqa.selenium.TimeoutException: timeout:
		
		driver.get("https://app.hubspot.com/");
		Thread.sleep(5000);
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("arjunkumayan18@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Defence@5050");
		 		
		driver.findElement(By.id("loginBtn")).submit();
		driver.quit();

	}

}
