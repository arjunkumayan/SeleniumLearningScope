package NinjaSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicActions1 {
	
	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setup() {
		//WebDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		baseUrl="https://letskodeit.teachable.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void test() {		
		driver.get(baseUrl);	
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		System.out.println("clicked on login");
		driver.findElement(By.id("user_email")).clear();
		driver.findElement(By.id("user_email")).sendKeys("test@gmail.com");
		System.out.println("Sending keys to user name field");
		
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_password")).sendKeys("test");
		System.out.println("Sending keys to user password field");
		
	}
	
	@After
	public void tearDown() {
		
		
	}
}
