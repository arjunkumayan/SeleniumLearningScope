package SeleniumHierarchy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSDemoSendkeys {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		js.executeScript("arguments[0].value='arjun singh'",username);
		

	}

}
