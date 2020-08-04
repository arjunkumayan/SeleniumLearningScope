package SeleniumHierarchy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectLinkTextCheck {
	WebDriver driver;
	
	By totalLinksPath = By.xpath("//input[@type='text']");
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php");
		
	}
	
	@Test
	public void doEnterText() {
		
		List<WebElement> totalTextField =driver.findElements(totalLinksPath);
		
	       for(int i=0; i<totalTextField.size() ; i++) {
	    	   totalTextField.get(i).sendKeys("Arjun");
	       }
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
