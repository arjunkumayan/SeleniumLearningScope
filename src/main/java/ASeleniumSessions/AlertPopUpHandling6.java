package ASeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandling6 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		// Alerts- popup - special java script alerts 
		// you can write your own alert - go to console and write alert("write your message"); - enter press button
		
		// Alert are not webelements - can not help with any locators - this is an alert and even you can inspect it
		
		// alert interface - only responsible for java script popup
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		// to handle the pop up we have to switch the page to pop up
		Thread.sleep(5000);
		Alert  alert = driver.switchTo().alert();
		alert.accept();
		alert.getText();
		alert.sendKeys(" ");
		
		String text = alert.getText();
		
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("correct message");
		}
		else
		{
			System.out.println("in-correct message");
		}
		
		//alert.accept(); // click on OK button
		
		alert.dismiss(); // cancel the alert
		
		
	}

}
