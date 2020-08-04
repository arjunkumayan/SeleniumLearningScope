package NinjaSelenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchAlert {

	
	private WebDriver driver;
	private String baseUrl;
		private JavascriptExecutor js;
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		js= (JavascriptExecutor)driver;
		
		baseUrl ="https://letskodeit.teachable.com/p/practice";
		
		// Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testAlert() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(3000);

		WebElement alertElement = driver.findElement(By.id("alertbtn"));
		alertElement.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	@Test
	public void testConfirm() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(3000);

		WebElement confirmElement = driver.findElement(By.id("confirmbtn"));
		confirmElement.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
//		alert.sendKeys("");
//		alert.dismiss();
//		alert.getText();
	
		
	}
	
	
	@After
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
	
}
