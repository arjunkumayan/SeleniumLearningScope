package NSeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubClass {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		By emailID = By.id("username1");
		isElementPresent(driver, emailID, 10).sendKeys("test@gmail.com ");
		
	}
	
	public static WebElement getElement(WebDriver driver, By locator){
		return driver.findElement(locator);
	}

	public static WebElement isElementPresent(WebDriver driver, By locator, int time) {
		WebElement final_element = null;
		for (int i = 0; i < time; i++) {
			try {
				final_element = getElement(driver, locator);
				break;
			} catch (Exception e) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					System.out.println("Waiting for element to appear on DOM");
				}
			}
		}
		return final_element;
	}

}
