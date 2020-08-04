package NinjaSelenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow {

	
	private WebDriver driver;
	private String baseUrl;
		private JavascriptExecutor js;
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		js= (JavascriptExecutor)driver;
		
		baseUrl ="https://letskodeit.teachable.com/p/practice";
		
		// Maximize
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws InterruptedException {		
		driver.get(baseUrl);
		
//		WebElement openWindow = driver.findElement(By.id("openwindow"));
//		openWindow.click();
//		
//		WebElement searchBox= driver.findElement(By.id("search-courses"));
//		searchBox.sendKeys("python");
//		
		// Get the handle
		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent window handle: "+parentHandle);
		// Find Open window button
		WebElement openWindow = driver.findElement(By.id("openwindow"));
 		openWindow.click();
 		
 		//Get All handles
 		
 		 Set<String> handles = driver.getWindowHandles();
 		 
 		 //Switching between handles
 		 
 		 for(String handle: handles) {
 			 System.out.println(handles);
 			 if(!handle.equals(parentHandle)) {
 				 driver.switchTo().window(handle);
 				 Thread.sleep(2000);
 				WebElement searchBox= driver.findElement(By.id("search-courses"));
                searchBox.sendKeys("python");
                Thread.sleep(2000);
                driver.close();
                break;
 			 }
 		 }
 		
 		 //Switch back to parent window
 	  driver.switchTo().window(parentHandle);
 	  driver.findElement(By.id("name")).sendKeys("test successfully ");
 		 
 		
		
	}
	
	@After
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		//driver.quit();
	}
	
}
