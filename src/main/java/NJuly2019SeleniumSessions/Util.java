package NJuly2019SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumSessions.JavaScriptUtil;

public class Util {
	
	public static final int DEFAULT_EXP_WAIT = 15;

	/**
	 * This method is used to handle alert and it will return alert text
	 * 
	 * @param driver
	 * @return text
	 */
	public static String getAlertText(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		return text;
	}

	/**
	 * get the title of the page
	 * 
	 * @param driver
	 * @return title of the page
	 */
	public static String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}

	/**
	 * launch the url
	 * 
	 * @param driver
	 * @param url
	 */
	public static void launchUrl(WebDriver driver, String url) {
		driver.get(url);
	}

	/**
	 * this is used to launch the browser
	 * 
	 * @param driver
	 * @param browserName
	 */
	public static WebDriver launchBrowser(WebDriver driver, String browserName) {
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/NaveenKhunteta/Downloads/geckodriver");
			driver = new FirefoxDriver();
		} else {
			System.out.println("browser name is not correct :" + browserName);
		}
		
		return driver;
	}

	/**
	 * click on element
	 * 
	 * @param driver
	 * @param locator
	 */
	public static void doClick(WebDriver driver, By locator) {
		driver.findElement(locator).click();
	}

	/**
	 * quit the browser
	 * 
	 * @param driver
	 */
	public static void closeBrowser(WebDriver driver) {
		driver.quit();
	}
	
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator, int timeout){
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		WebElement element = driver.findElement(locator);
		//JavaScriptUtil.flash(element, driver);
		return element;
	}

}
