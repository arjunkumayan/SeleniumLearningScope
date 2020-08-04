package SeleniumExceptionsList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementNotInteractableDemo {
	
	@Test
	public void test1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://login.yahoo.com/");
		
		WebElement emailfield = driver.findElement(By.id("login-username"));
		
		emailfield.sendKeys("testing");
		
		WebElement loginButton = driver.findElement(By.id("persistent"));
		loginButton.click();
	}

}
