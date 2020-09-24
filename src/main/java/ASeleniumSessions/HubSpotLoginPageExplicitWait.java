package ASeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLoginPageExplicitWait {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://app.hubspot.com");
		
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		
		wait1.until(ExpectedConditions.titleContains("HubSpot Login"));
		
		System.out.println(driver.getTitle());
		
		By emaillD = By.id("username");
		By pwd =By.id("month");
		By loginBtn =By.id("year");
		
		//WebElement emailId =  driver.findElement(By.id("username"));
		//WebElement pwd =  driver.findElement(By.id("password"));
		//WebElement loginBtn =  driver.findElement(By.id("loginBtn"));
		
		
		WebDriverWait wait =  new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.presenceOfElementLocated(emaillD));
		
		WebDriverWait elementWait = new WebDriverWait(driver,4);
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn));
		
		
		//Exception in thread "main" org.openqa.selenium.TimeoutException: Expected condition failed:
		//waiting for presence of element located by: 
		//By.id: username (tried for 3 second(s) with 500 milliseconds interval) 0.5 secs
		
		// if element is not found using the explicit wait time then we get the TimeOut exception insted of nusuchelementexception(implicit wait)
		
		// extra polling mechanish - 500ms - 0.5 sec default polling time
		
		// difference
		
		
		WebElement email=  driver.findElement(emaillD);
		
		email.sendKeys("arjunkumayan18@gmail.com");
		
		// its not a global wait 
		// applied on explicit WebElement
		// TimeOutException instead of NoSuchElementException
		
		// implicit wait - No polling mechanism
		
        // better to go with explicit wait always because if you give wait for one element then meantime all other elements will be visible
		// explict wait - WebElement + Non WebElement
		
		// by the time the emailid is visible you can start with passsword
	
		WebElement pwd1 =  driver.findElement(By.id("password"));
		pwd1.sendKeys("Defence@5050");
		
		WebElement loginBtn1 =  driver.findElement(By.id("loginBtn"));
		loginBtn1.click();
	}

}
