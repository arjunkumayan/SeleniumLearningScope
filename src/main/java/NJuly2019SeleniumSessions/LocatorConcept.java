package NJuly2019SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		//HTM DOM 
		//1. id: -- I
//		By username = By.id("username");
//		Util.getElement(driver, username).sendKeys("test@gmail.com");
//		
//		By password = By.id("password");
//		Util.getElement(driver, password).sendKeys("test@123");
//		
//		By loginButton = By.id("loginBtn");
//		Util.getElement(driver, loginButton).click();
		
		//2. name: -- II
//		driver.findElement(By.name("username")).sendKeys("testautomation");
//		WebElement element = driver.findElement(By.name("username"));
//		element.sendKeys("testautomation");
		
//		By username = By.name("username");
//		Util.getElement(driver, username).sendKeys("testautomation");
		
		//3. xpath: --III
		//driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test@gmail.com");
		
//		WebElement element = driver.findElement(By.xpath("//*[@id='username']"));
//		element.sendKeys("test@gmail.com");
		
//		By username = By.xpath("//*[@id='username']");
//		Util.getElement(driver, username).sendKeys("test@gmail.com");
		
		//4. CSS Selector: -- III
//		By username = By.cssSelector("#username");
//		Util.getElement(driver, username).sendKeys("test@gmail.com");
		
		//5. class name:
//		form-control private-form__control login-email
//		form-control private-form__control login-password m-bottom-3
//		By username = By.className("login-email");
//		Util.getElement(driver, username).sendKeys("test@gmail.com");
//		
//		By password = By.className("login-password");
//		Util.getElement(driver, password).sendKeys("test@123");
		
		
		//6. link Text: only for links
//		By signUpLink = By.linkText("Sign up");
//		Util.getElement(driver, signUpLink).click();
		
		//7. partial link text: only for links
		By signUpLink = By.partialLinkText("Sign");
		Util.getElement(driver, signUpLink, 10).click();		
		
		
		
//		WebElement userElement = driver.findElement(username);
//		userElement.sendKeys("test@gmail.com");
		
//		WebElement userElement = driver.findElement(By.id("username"));
//		userElement.sendKeys("naveen@gmail.com");
		
		//driver.findElement(By.id("username")).sendKeys("naveen@gmail.com");
		
//		WebElement passwordElement = driver.findElement(By.id("password"));
//		passwordElement.sendKeys("test@123");
//		
//		WebElement loginButton = driver.findElement(By.id("loginBtn"));
//		loginButton.click();
		
	}

}
