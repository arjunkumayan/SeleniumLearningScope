package SeleniumHierarchy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSDemoClick1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.yahoo.com/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='persistent']"));
		js.executeScript("arguments[0].click()",checkbox);
		
		

	}

}
