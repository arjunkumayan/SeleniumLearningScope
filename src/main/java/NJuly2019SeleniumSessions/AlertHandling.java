package NJuly2019SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// JS Alert -- POP ups

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();// click on go button

		Thread.sleep(4000);
		
		String text = Util.getAlertText(driver);
		
		if(text.equals("Please enter a valid user name")){
			System.out.println("correct messg");
		}else{
			System.out.println("in correct messg");
		}
		
//		Alert alert = driver.switchTo().alert();
//
//		String text = alert.getText();
//		System.out.println(text);
//
//		if (text.equals("Please enter a valid user name")) {
//			System.out.println("correct messg");
//		} else {
//			System.out.println("in correct messg");
//		}
//
//		alert.accept();// click ok button

		// alert.dismiss();//cancel the alert

	}

	

}
