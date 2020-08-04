package SeleniumHierarchy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasicsSet1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		driver.get(" ");
		driver.quit();
		driver.close();
		driver.getCurrentUrl();
		driver.getPageSource();
		driver.getTitle();
		driver.getWindowHandle();
		driver.getWindowHandles();
		driver.findElement(By.xpath(""));
		driver.findElements(By.xpath(" "));
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Options option = driver.manage();
		option.addCookie(null);
		option.deleteAllCookies();
		
		
		Navigation nav = driver.navigate();
		
		
		TargetLocator locator = driver.switchTo();
		
		
	}
	
	
}
