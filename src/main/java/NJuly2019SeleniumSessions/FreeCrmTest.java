package NJuly2019SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSessions.JavaScriptUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeCrmTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(5000);
		
		//String title = JavaScriptUtil.getTitleByJS(driver);
	   // 	System.out.println(title);
		
		//WebElement signUpLink = driver.findElement(By.linkText("Sign up"));
		
		//JavaScriptUtil.clickElementByJS(signUpLink, driver);
		
		//JavaScriptUtil.refreshBrowserByJS(driver);
		
		//JavaScriptUtil.generateAlert(driver, "this is my javascript alert");
		
		//JavaScriptUtil.drawBorder(signUpLink, driver);
		
		//JavaScriptUtil.sendKeysUsingJSWithID(driver, "username", "naveen@gmail.com");
		
//		String browserValue = JavaScriptUtil.getBrowserInfo(driver); -- whenever you are in this page please check the javascriptutil page
//		System.out.println(browserValue);
		
		//System.out.println(JavaScriptUtil.getPageInnerText(driver));
		
//		WebElement email = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
//		
//		JavaScriptUtil.flash(email, driver);
//		email.sendKeys("naveen@gmail.com");
//		
//		JavaScriptUtil.flash(password, driver);
//		password.sendKeys("test@123");
//		
//		JavaScriptUtil.flash(loginBtn, driver);
//		loginBtn.click();
		
		
//		Util.getElement(driver, By.id("username"), 10).sendKeys("naveen@gmail.com");
//		Util.getElement(driver, By.id("password"), 1).sendKeys("test@123");
//		Util.getElement(driver, By.id("loginBtn"), 1).click();

	//	JavaScriptUtil.scrollPageDown(driver);
		
		
		
	}

}
