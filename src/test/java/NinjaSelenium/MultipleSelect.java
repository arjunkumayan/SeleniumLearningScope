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

public class MultipleSelect {
	
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
	public void testMultipleSelect() throws InterruptedException {
		
        WebElement element =	driver.findElement(By.id("multiple-select-example"));
		Select sel = new Select(element);
		
		Thread.sleep(2000);
        System.out.println("Select Orange by value");
        sel.selectByValue("orange");
        
        Thread.sleep(2000);
        System.out.println("De-Select Orange by value");
        sel.deselectByValue("orange");
        
        Thread.sleep(2000);
        System.out.println("Selet Peach by index");
        sel.selectByIndex(2);
        
        Thread.sleep(2000);
        System.out.println("Select Apple by visible-text");        
        sel.selectByVisibleText("Apple");
        
        Thread.sleep(2000);
        
        System.out.println("Print all selected options");
        
        List<WebElement> selectedOptions =  sel.getOptions();
        for(WebElement option:selectedOptions) {
        	System.out.println(option.getText());
        }
        
        Thread.sleep(2000);
        System.out.println("De-Select all selected options");
        sel.deselectAll();
        
		
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
