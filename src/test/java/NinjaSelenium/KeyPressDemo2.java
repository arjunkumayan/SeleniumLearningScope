package NinjaSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class KeyPressDemo2 {

	
	private WebDriver driver;
	private String baseUrl;
	private JavascriptExecutor js;
		
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		js= (JavascriptExecutor)driver;
		baseUrl ="https://app.hubspot.com/";
		
		// Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testKeysAction() throws InterruptedException {

		driver.get(baseUrl);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));

		Actions action = new Actions(driver);
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("arjunkumaya@gmail.com");
		email.sendKeys(Keys.CONTROL +"a");
		Thread.sleep(2000);
		
	}
	
	@Test
	public void testKeysChord() throws InterruptedException {

		driver.get(baseUrl);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));

		Actions action = new Actions(driver);
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("arjunkumaya@gmail.com");
		email.sendKeys(Keys.CONTROL +"a");
		Thread.sleep(2000);
		
		WebElement password =driver.findElement(By.id("password"));
		password.sendKeys("temp123");
		password.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		
		String selectAll = Keys.chord(Keys.CONTROL,"a");
		
		driver.findElement(By.id("password")).sendKeys(selectAll);
		
	}
		
	@After
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
	
}
