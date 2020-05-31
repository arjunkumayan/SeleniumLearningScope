package NJuly2019SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpWaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		//imp wait: global wait: for all the webelements
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://app.hubspot.com/login");
		
		//Thread.sleep(15000);
		
		//Exp Wait: for non web element
		//WebDriverWait wait = new WebDriverWait(driver, 15);
		//wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		
		//Exception in thread "main" org.openqa.selenium.TimeoutException: 
		//Expected condition failed: waiting for title to contain "HubSpot Login". 
		//Current title: "Checking browser" 
		//(tried for 3 second(s) with 500 milliseconds interval)	
		
		//System.out.println(driver.getTitle());
		String title = getPageTitle(driver, 10, "HubSpot Login");
		System.out.println("page title is: "+ title);
		
		
		//for webelements
//		By email = By.id("username");
//		wait.until(ExpectedConditions.presenceOfElementLocated(email));
//		driver.findElement(email).sendKeys("test@gmail.com");
		
		By email = By.id("username");
		By pwd = By.id("password");
		By loginBtn = By.id("loginBtn");
		By header = By.className("private-header__heading");

		getElement(driver, email, 10).sendKeys("naveenanimation20@gmail.com");
		getElement(driver, pwd, 1).sendKeys("Test@12345");
		getElement(driver, loginBtn, 1).click();
		
		String text = getElement(driver, header, Util.DEFAULT_EXP_WAIT).getText();
		System.out.println(text);
		
		//System.out.println(driver.findElement(By.className("private-header__heading")).getText());
	}
	
	public static WebElement getElement(WebDriver driver, By locator, int timeout){
		waitForPresenceOfElement(driver, locator, timeout);
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	public static void waitForPresenceOfElement(WebDriver driver, By locator, int timeout ){
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static String getPageTitle(WebDriver driver, int timeout, String title){
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	
	

}
