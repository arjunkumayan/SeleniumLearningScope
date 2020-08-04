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

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithElementsList {
	
	WebDriver driver;
	String baseUrl;
	
	
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
	public void test() throws InterruptedException {
		boolean isChecked= false;
		List<WebElement>  radioButtons = driver.findElements(By.xpath("//input[contains(@type,'radio' ) and contains(@name,'cars')]"));
	    int size = radioButtons.size();
	    
	    System.out.println("Size of the list is: "+size);
		for (int i = 0; i < size; i++) {
			isChecked = radioButtons.get(i).isSelected();

			if (!isChecked) {
				radioButtons.get(i).click();
				Thread.sleep(2000);
			}

		}
	
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
