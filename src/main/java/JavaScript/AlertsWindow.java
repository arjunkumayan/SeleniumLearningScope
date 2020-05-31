package JavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsWindow {
	WebDriver driver;
	JavascriptExecutor js;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://login.yahoo.com/");

		Thread.sleep(3000);
		js = (JavascriptExecutor)driver;
	}

	@Test
	public void testAlert() throws InterruptedException {
		js.executeScript("alert('Hello this is just alert with OK button and without the cancel button')");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

	}

	@Test
	public void testPrompt() throws InterruptedException {
		
		js.executeScript("prompt('do you want to send the keys')");
	     Thread.sleep(3000);
	   driver.switchTo().alert().sendKeys("High Arjun");
	    
	   // to validate the alert text message
       String text =  driver.switchTo().alert().getText();
       Assert.assertEquals(text, "do you want to send the keys");
       
       Thread.sleep(3000);
       driver.switchTo().alert().accept();
	}

	@Test
	public void testConfirm() throws InterruptedException {
		js.executeScript("confirm('do you want to give your accent and check')");
		 Thread.sleep(3000);
		 driver.switchTo().alert().accept();
		 Thread.sleep(3000);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
