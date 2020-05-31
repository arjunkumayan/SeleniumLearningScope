package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementText {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();//launch chrome

		driver.get("https://app.hubspot.com/login");//enter url
		
		Thread.sleep(5000);
		
		String text = driver.findElement(By.className("signup-link")).getText();
		System.out.println(text);
		
	   WebElement textElement = driver.findElement(By.className("signup-link"));
	
	  File srcFile = textElement.getScreenshotAs(OutputType.FILE);
	  
	  try {
		FileUtils.copyFile(srcFile, new File("./target/Screenshots/signupLink.png"));
	  } catch (IOException e) {
		
		e.printStackTrace();
	}
	   
		//click - links, buttons, images, checkbox, radiobuttons
		//sendkeys -- text fields
		//get text -- getting the text from a label, text, error mesg
		
		
		
	}

}
