package ASeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotConcept17 {

	public static void main(String[] args) throws InterruptedException, IOException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://app.hubspot.com");
		
		Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.id("username"));

		email.sendKeys("arjun@gmail.com");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("test123");
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		// screenshot
		// getScreenshot - method
		// TakesScreenshot interface
		takePageScreenShot(driver, "fullPage");
		takePageScrnshot(driver, "test1");
		/*
		 * taleElementScreenShot(email,"username");
		 * taleElementScreenShot(pwd,"password");
		 * taleElementScreenShot(loginButton,"loginBtn");
		 */
		
	}
	
	public static void takePageScreenShot(WebDriver driver , String fileName) 
	{
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./target/screenshots/"+fileName+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void takePageScrnshot(WebDriver driver, String filename) {
		File file = new File(filename);
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./target/screenshots/" + filename + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * public static void taleElementScreenShot(WebElement element , String
	 * fileName) { File srcFile =
	 * ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE); try {
	 * FileUtils.copyFile(srcFile, new
	 * File("./target/screenshots/"+fileName+".png")); } catch (IOException e) {
	 * e.printStackTrace(); }
	 * 
	 * }
	 */

}
