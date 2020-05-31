package ASeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextFieldValue {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		driver.findElement(By.id("login1")).sendKeys("test@gmail.com");
		
		
		String value = driver.findElement(By.id("login1")).getAttribute("value");//getAttribute("value") - it will work only for the text field
		
		System.out.println(value);
		
		// getText() - only for text
		// getAttribute(" ") - only for text field
	}

}
