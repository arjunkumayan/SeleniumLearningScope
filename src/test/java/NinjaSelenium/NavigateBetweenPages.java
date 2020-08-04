package NinjaSelenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateBetweenPages {
	
	WebDriver driver;
	String baseUrl;
	
	
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		baseUrl="https://letskodeit.teachable.com/";
		driver.get(baseUrl);
	}
	@Test
	public void test() throws InterruptedException {
		
		
	String title =	driver.getTitle();
		System.out.println("Title of the page is: "+title);

	String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: "+currentUrl);
		
		
		String urlToNavigate="https://letskodeit.teachable.com/p/practice";
		driver.navigate().to(urlToNavigate);
		
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: "+currentUrl);
		
		Thread.sleep(3000);
		
		System.out.println(" Navigate back---");
		driver.navigate().back();
		
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: "+currentUrl);
		
		Thread.sleep(2000);
		
		System.out.println("Navigate forward---");
		driver.navigate().forward();
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: "+currentUrl);
		
         Thread.sleep(3000);
		
	
		driver.navigate().back();
		System.out.println(" Navigate back---");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: "+currentUrl);
		driver.navigate().refresh();
		
		System.out.println("Navigate refresh--");
		driver.get(currentUrl);
		System.out.println("Again Refresh--");
		
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
