package NinjaSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownSelect {
	
	private WebDriver driver;
	private String baseUrl;
	
	
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		baseUrl="https://letskodeit.teachable.com/p/practice";
		driver.get(baseUrl);
	}
	@Test
	public void testDropdown() throws InterruptedException {
		WebElement element = driver.findElement(By.id("carselect"));		
		Select sel = new Select(element);
		Thread.sleep(2000);
		
		System.out.println("Selecting Benz by value");
		sel.selectByValue("benz");
		
		Thread.sleep(2000);
		System.out.println("Selecting honda by index");
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		System.out.println("Selecting BMW by visible text");
		sel.selectByVisibleText("BMW");
		
		Thread.sleep(2000);
		System.out.println("Print the list of options");
		List<WebElement> options = sel.getOptions();
		int size = options.size();
		
		for(int i=0; i<size; i++) {
			String optionName = options.get(i).getText();
			System.out.println(optionName);
		}
		
		
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
