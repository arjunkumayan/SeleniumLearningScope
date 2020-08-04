package NinjaSelenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.stream.events.Characters;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotDemo {
	
	WebDriver driver;
	String baseUrl;
		
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		baseUrl ="https://ui.freecrm.com/";
		
		// Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void takeScreenShots() throws InterruptedException {
		driver.get(baseUrl);		
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login']"));
		loginButton.click();
		
	}
	
	@After
	public void tearDown() throws InterruptedException, IOException {		
		Thread.sleep(2000);
		String filename = getRandomString(10) +".png";
		String directory = System.getProperty("user.dir")+"//screenshots//";		
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(sourceFile, new File(directory + filename));		
		driver.quit();
	}
	
	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters="abcdefghijklmnoprstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		
		for(int i=0 ; i<length ; i++) {
			int index =(int)(Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
		
		return sb.toString();
	}
	
	
	
	
	
	

}
