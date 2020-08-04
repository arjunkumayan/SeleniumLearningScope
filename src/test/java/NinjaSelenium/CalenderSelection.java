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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderSelection {
	
	WebDriver driver;
	String baseUrl;
		
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		baseUrl ="https://www.expedia.com/";
		
		// Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void test1() throws InterruptedException {
		driver.get(baseUrl);

		WebElement flightElement = driver.findElement(By.id("tab-flight-tab-hp"));
		flightElement.click();
		Thread.sleep(2000);
		WebElement departElement = driver.findElement(By.id("flight-departing-hp-flight"));
		departElement.click();
		Thread.sleep(2000);
		
		WebElement daySelect = driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][position()=1]//button[text()=' 20']"));
		daySelect.click();

	}
	
	@Test
	public void test2() throws InterruptedException {
		driver.get(baseUrl);

		WebElement flightElement = driver.findElement(By.id("tab-flight-tab-hp"));
		flightElement.click();
		Thread.sleep(2000);
		WebElement departElement = driver.findElement(By.id("flight-departing-hp-flight"));
		departElement.click();
		Thread.sleep(2000);
		
		List<WebElement> disabledElements = driver.findElements(By.xpath("//div[@class='datepicker-cal-month'][position()=1]//tbody[@class='datepicker-cal-dates']/tr/td/span"));
		
		System.out.println("Size of total disabled items is: "+ disabledElements.size());
		
		for(WebElement disabled:disabledElements) {
			System.out.println(disabled.getText());
			
		}

	}
	

	@Test
	public void test3() throws InterruptedException {
		driver.get(baseUrl);

		WebElement flightElement = driver.findElement(By.id("tab-flight-tab-hp"));
		flightElement.click();
		Thread.sleep(2000);
		WebElement departElement = driver.findElement(By.id("flight-departing-hp-flight"));
		departElement.click();
		Thread.sleep(2000);
		
		List<WebElement> enabledElements = driver.findElements(By.xpath("//div[@class='datepicker-cal-month'][position()=1]//tbody[@class='datepicker-cal-dates']/tr/td/button"));
		
		System.out.println("Size of total enabled Elements is: "+ enabledElements.size());
		
		for(WebElement disabled:enabledElements) {
			System.out.println(disabled.getText());
			
		}

	}
	
	@Test
	public void test4() throws InterruptedException {
		driver.get(baseUrl);

		WebElement flightElement = driver.findElement(By.id("tab-flight-tab-hp"));
		flightElement.click();
		Thread.sleep(2000);
		WebElement departElement = driver.findElement(By.id("flight-departing-hp-flight"));
		departElement.click();
		Thread.sleep(2000);
		
		 WebElement calMonth = driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][position()=1]"));
		
		 List<WebElement> allValidDates = calMonth.findElements(By.xpath("//tbody[@class='datepicker-cal-dates']/tr/td/button"));
		 
		 Thread.sleep(2000);

		for(WebElement date:allValidDates) {
			System.out.println(date.getText());
		if(date.getText().equals("20")) {
			date.click();
			break;
		}
		}
			
		}

	
	
	@After
	public void tearDown() throws InterruptedException {		
		Thread.sleep(2000);
		//driver.quit();
	}
	
	
	
	
	
	
	
	

}
