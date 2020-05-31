package JavaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest1 {


	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		// driver.get("https://app.hubspot.com/");
		
		driver.get("http://classic.crmpro.com/");
		Thread.sleep(9000);
		
		JavaScriptUtil1 js= new JavaScriptUtil1(driver);
	//	js.sendKeysUsingJSWithId("username", "arjun");
		// js- refresh browser - history.go(0);
	//	js.refreshBrowserByJS();
		
		//js.generateAlert("Hi Alert!!!");
		
		// js-  sendkeys - document.getElementById('ID').value='arjun'
		
	//	WebElement forgotLink = driver.findElement(By.linkText("Forgot my password"));
		
		//js.clickElementByJS(forgotLink);
		
		//js.sendKeysUsingJSWithId("password", "Test");
		
		//js- get browser info -Navigator.userAgent
		
		//String browserInfo = js.getBrowserInfo();
		//System.out.println(browserInfo);
       
		
		// get page inner text - with text which is available on page
		// js - document.documentElement.innerText
	 	// System.out.println(js.getPageInnerText());
		
		//js -title - document.title;
		
		String title  = js.getTitleByJS();
		System.out.println(title);
		
	//	js.drawBorder(driver.findElement(By.id("username")));
		
		//js.flash(forgotLink);
		
		WebElement forgotElement = driver.findElement(By.linkText("Forgot Password?"));
		
	//	ScrollITo(driver);
		ScrollIntoView(forgotElement, driver);
		forgotElement.click();
		
		js.sendKeysUsingJSWithName("username", "arjun");
		
		js.checkPageIsReady();
		
	}
	
	public static void ScrollITo(WebDriver driver)
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void ScrollIntoView(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}


}
