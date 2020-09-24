package SeleniumHierarchy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumClassTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		
		driver.get("");
		driver.close();
		driver.quit();
		
		driver.findElement(By.xpath(""));
		driver.findElements(By.xpath(""));
		
		driver.getCurrentUrl();
		driver.getTitle();
		driver.getWindowHandle();
		driver.getWindowHandles();
		
		driver.getPageSource();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().window().getPosition();
		driver.manage().window().getSize();
		
		driver.navigate().back();
		driver.navigate().to("");
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().toString();
		
		
		driver.switchTo().window("window id");
		
		driver.switchTo().alert();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);		
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.HOURS);
		
		
		
		
		
		
	}

}
