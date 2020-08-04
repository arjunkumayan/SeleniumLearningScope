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


public class KeyPressDemo1 {

	
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
		action.moveToElement(email).sendKeys("arjuns@gmail.com").build().perform();
		WebElement password = driver.findElement(By.id("password"));
		action.sendKeys(password, "temp123").build().perform();
		
		Thread.sleep(3000);		
		action.moveToElement(driver.findElement(By.id("loginBtn"))).sendKeys(Keys.ENTER).build().perform();
		
		//driver.findElement(By.id("loginBtn")).sendKeys(Keys.ENTER);
		

		String text = driver.findElement(By.xpath("//div[@class='private-alert__inner']/h5")).getText();
		System.out.println(text);
	}
	
	@Test
	public void testKeysTabAction() throws InterruptedException {

		driver.get(baseUrl);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));

		Actions action = new Actions(driver);
		WebElement email = driver.findElement(By.id("username"));
		action.moveToElement(email).sendKeys("arjuns@gmail.com").build().perform();
		
		driver.findElement(By.id("username")).sendKeys(Keys.TAB);
		
		//WebElement password = driver.findElement(By.id("password"));
		//action.sendKeys(password, "temp123").build().perform();
		
		Thread.sleep(3000);		
		//action.moveToElement(driver.findElement(By.id("loginBtn"))).sendKeys(Keys.ENTER).build().perform();
		
		//driver.findElement(By.id("loginBtn")).sendKeys(Keys.ENTER);
		

		//String text = driver.findElement(By.xpath("//div[@class='private-alert__inner']/h5")).getText();
		//System.out.println(text);
	}
	
	
	@After
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
	
}
