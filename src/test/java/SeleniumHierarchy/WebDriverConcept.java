package SeleniumHierarchy;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverConcept {

	public static void main(String[] args) {
WebDriverManager.chromedriver().version("3.141.59").setup();
		
		WebDriver driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver = new SafariDriver();
		driver = new EdgeDriver();
		
		driver.findElement(By.xpath(""));
		driver.findElements(By.xpath(" "));
		driver.get("");
		driver.getCurrentUrl();
		driver.getPageSource();
		driver.getTitle();
		driver.getWindowHandle();
		Set<String> set1 = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<>();
		al.addAll(set1);
		
		
		driver.close();
		driver.quit();
		
		TargetLocator target = driver.switchTo(); // Frame, window, Alert
		
		
		Navigation navigate = driver.navigate(); // Browser back, forward, to, to url
		
		Options options = driver.manage(); // Browser Cookie related method
		//options.addCookie("");
		options.deleteAllCookies();
		options.getCookieNamed("");
		
		//Timeouts interface
		
		
		// Interface Navigation
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.google.com");
		try {
			URL url = new URL("https://www.google.com");
			driver.navigate().to(url);
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		
		
		// Interface Window
		
		driver.switchTo().window(" ");
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.manage().window().getPosition();
		driver.manage().window().getSize();
		//driver.manage().window().setPosition(20,10);
		//driver.manage().window().setSize(10.4);
		try {
			driver.manage().window().wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.manage().window().wait(100, TimeUnit.NANOSECONDS);
		
		// TargetLocator Interface
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frameName");
		driver.switchTo().frame("//input[@id='ar'");
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.switchTo().alert();
		driver.switchTo().activeElement();
		driver.close();
		driver.switchTo().parentFrame();
		driver.switchTo().window(driver.getWindowHandle());
		//driver.switchTo().window(driver.getWindowHandles());
		
		
		// Options Interface
		//driver.manage().addCookie();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("teota");
		driver.manage().getCookieNamed("hello");
		Set<Cookie> cookieeList = driver.manage().getCookies();
		driver.manage().logs();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.HOURS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.NANOSECONDS);
		
		//interface JavascriptExecutor 
		//   Object executeScript(String script, Object... args);
		//interface TakesScreenshot
		// <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException;
	
	
		WebDriver driver1 = new ChromeDriver();
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
		File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
	
	
	
		WebElement element = driver.findElement(By.id("id1"));
		element.clear();
		element.click();
		element.findElement(By.xpath(""));
		element.findElements(By.xpath(""));
		element.getAttribute("href");
		element.getText();
		
	
	
	
	
		
		driver.get("");
		driver.getCurrentUrl();
		driver.getPageSource();
		driver.close();
		driver.quit();
		driver.getTitle();
		driver.getWindowHandle();
		driver.getWindowHandles();
		
		TargetLocator targetLocator = driver.switchTo();
		
		driver.switchTo().window("");
		driver.switchTo().alert();
		driver.switchTo().frame("");
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		
		
		Options option1= driver.manage();
		
		driver.manage().addCookie(null);
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("arjun");
		driver.manage();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		
		Set<Cookie> cookiesName =driver.manage().getCookies();
		
		
	  
		Navigation  nav = driver.navigate();
		
	       driver.navigate().back();
	       driver.navigate().to("");
	       driver.navigate().refresh();
	       driver.navigate().forward();
	       
	
	
	       driver.switchTo().window("");
	       
	       driver.switchTo().frame("");
	       
	       driver.switchTo().defaultContent();
	       
	       
	}

}
