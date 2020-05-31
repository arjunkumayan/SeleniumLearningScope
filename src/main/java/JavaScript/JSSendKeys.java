package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSSendKeys {
	
	
	@Test
	public void doClickUsingAnotherWayTest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.yahoo.com/");

		// driver.findElement(By.id("login-username")).sendKeys("arjunkumayan18@gmail.com");
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement email  = driver.findElement(By.id("login-username"));
		
		js.executeScript("arguments[0].value='arjunkumaya@gmail.com'",email);
		js.executeScript("document.getElementById('persistent').click()");

	}

}
