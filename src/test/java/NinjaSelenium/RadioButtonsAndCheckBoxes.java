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

public class RadioButtonsAndCheckBoxes {
	/*
	 * Difference between radio and checkbox - 

      All are input tag but the type are different
      type="checkbox"
      type="radio"
      don't just go with look and feel for radio and checkbox but look for the actual tag and check
      
	 * 
	 */

	
	WebDriver driver;
	String baseUrl;
	
	
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		baseUrl="https://letskodeit.teachable.com/p/practice";
		driver.get(baseUrl);
	}
	
	@Test
	public void test() throws InterruptedException {

		WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
		bmwRadioBtn.click();

		Thread.sleep(2000);
		WebElement benzradioBtn = driver.findElement(By.id("benzradio"));
		benzradioBtn.click();


		Thread.sleep(2000);
		WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
		bmwCheckBox.click();

		Thread.sleep(2000);
		WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
		benzCheckBox.click();
		
		System.out.println("BMW Radio is selected? "+bmwRadioBtn.isSelected());
		System.out.println("BENZ Radio is selected? "+benzradioBtn.isSelected());
		System.out.println("BMW checkbox is selected? "+bmwRadioBtn.isSelected());
		System.out.println("BENZ checkbox is selected? "+benzCheckBox.isSelected());
		
	

	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
}
