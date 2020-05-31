package N2020SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementRefException {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("naveen");
		
		driver.navigate().refresh();

		username = driver.findElement(By.name("username"));
		username.sendKeys("SeleniumUser");
		
		
		
	}

}
