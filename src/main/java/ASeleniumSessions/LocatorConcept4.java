package ASeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept4 {

	public static void main(String[] args) {

		// we have to interact with webelements
		// 8 different locators 
		

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com");
		
		//driver.get("http://classic.crmpro.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		// 1. id:
		//WebElement email = driver.findElement(By.id("username"));
		//email.sendKeys("arjunkumayan18@gmail.com");
		
		//WebElement pasword = driver.findElement(By.id("password"));
		//pasword.sendKeys("Defence@5050");
		
		//WebElement loginButton = driver.findElement(By.id("loginBtn"));
		//loginButton.click();
		
		
		//driver.findElement(By.id("username")).sendKeys("arjunkumayan18@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("Defence@5050");
		//driver.findElement(By.id("loginBtn")).sendKeys(Keys.ENTER);
		//driver.findElement(By.id("loginBtn")).submit();
		
		
		//2. Name
		
		//driver.findElement(By.name("username")).sendKeys("arjunkumayan18@gmail.com");
		
		//3. xpath
		
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test@123");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test1234");
		
		//4. css selector
				
		//driver.findElement(By.cssSelector("input[id='password']")).sendKeys("arjunkumayan18@gmail.com");
		//driver.findElement(By.cssSelector("input[id='password']")).sendKeys("test@123");
		
		
		//5. class name
		driver.findElement(By.className("login-email")).sendKeys("arjunkumayan18@gmail.com");
		driver.findElement(By.className("login-password")).sendKeys("arjunkumayan18@gmail.com");
		
		// casscaded class
		
		//tagname[@attribute='value1']
		//tagname[@attribute='value1'][@attribute='value2']
		//tagname[starts-with(@id='')]
		//tagname[end-with(@id='')]
		
		//tagname[contains(@attribute,'')]
		//tagname[text()='']
		//tagname[contains(text(),'']
		
		//6. link text - only for links
		
	   //driver.findElement(By.linkText("Show Password")).click();
		
		//driver.findElement(By.linkText("Sign up")).click();
		
		//7. partial link text
		//driver.findElement(By.partialLinkText("Sign")).click();
		
		// 8. tag name - with findelements
		//driver.findElement(By.tagName(tagName));
		
		// priority - 
		//1->id
		//2->name
		//3->xpath, in case of dynamic id
		//4-> css selector
		//5 -> class name- it is used for look and feel feature of the elements
		//6-> links
		//7 -> partial link text
		//8-> tags
		
		
	}

}
