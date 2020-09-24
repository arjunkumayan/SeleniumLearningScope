package NinjaSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
	
	WebDriver driver = new ChromeDriver();
	
	TargetLocator target = driver.switchTo();
	
	Options option = driver.manage();
	
	// driver.manage().addCookie();
	driver.manage().deleteAllCookies();
	//driver.manage().deleteCookie(cookie);
	driver.manage().deleteCookieNamed("cookiename");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	
	driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
	
	// TargetLocator interface, Options, Navigate, Windows , IM
	
	driver.switchTo().window("");
	
	driver.manage().window().maximize();
	//driver.manage().window().setPosition();
	
	//driver.manage().window().setSize());
	
	driver.get("");

	driver.close();
	driver.quit();
	driver.findElement(By.id(""));
	
	driver.findElements(By.xpath(""));
	driver.getPageSource();
	driver.getCurrentUrl();
	driver.getPageSource();
	driver.getTitle();
	driver.getWindowHandle();
	
	Set<String> handles = driver.getWindowHandles();
	
	driver.manage();
	
	
	}

}
