package NinjaSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementState {
	
	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		baseUrl="https://www.google.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
	}

	
	@Test
	public void test() {		
		WebElement e1 = driver.findElement(By.name("q"));		
		System.out.println("E1 is Enabled? "+e1.isEnabled());
		
		WebElement e2 = driver.findElement(By.name("q"));		
		System.out.println("E2 is Enabled? "+e1.isEnabled());
		
		WebElement e3 = driver.findElement(By.name("q"));		
		System.out.println("E3 is Enabled? "+e1.isEnabled());
		
		e1.sendKeys("letskodeit");
		
		
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
