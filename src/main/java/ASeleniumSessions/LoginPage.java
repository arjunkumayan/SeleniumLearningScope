package ASeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://app.hubspot.com");
		
		
		
		By emailId = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		
		Util util = new Util(driver);
		
		String title =util.waitForTitlePresenet("HubSpot Login", 10);
		if(title.contains("HubSpot Login"))
		{
			System.out.println("corret title");
		}
		else
		{
			System.out.println("in correct title");
		}
		
		/*
		 * util.getElement(emailId).sendKeys("arjunlumayan18@gmail.com");;
		 * //element.sendKeys("arjunkumayan18@gmail.com");
		 * 
		 * WebElement pwd = util.getElement(password); pwd.sendKeys("Defence@5050");
		 * 
		 * util.getElement(loginButton).click();;
		 */
		util.waitForelementPresent(emailId, 15);  // 15 secs
		util.doSendKeys(emailId, "arjunkumaya@gmail.com");
		util.doSendKeys(password, "test@123");
		
		util.waitForelementPresent(loginButton, 3); // 3 secs
		util.doClick(loginButton);
		
		// we always use explicit wait 
	}

}
