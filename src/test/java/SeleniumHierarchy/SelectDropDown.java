package SeleniumHierarchy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {

	WebDriver driver=null;
	By day= By.xpath("//td[text()='Date of Birth']/parent::tr//select[1]");
	By month= By.xpath("//td[text()='Date of Birth']/parent::tr//select[2]");
	By year= By.xpath("//td[text()='Date of Birth']/parent::tr//select[3]");
	
	@Test
	public void selectDropwDownTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php");
		
		doGetElement(driver, day, 10);
		doGetElement(driver, month, 5);
		doGetElement(driver, year, 5);
		
		doSelectByIndex(driver, day, 5, 4);
		doSelectByText(driver, month, 5, "MAY");
		doSelectByValue(driver, year, 2, "2018");
		
	}
	
	public static WebElement doGetElement(WebDriver driver,By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
		return driver.findElement(locator);
	}
	
	public static void doSelectByIndex(WebDriver driver, By locator,int timeout,int index) {
		WebElement  element = doGetElement(driver, locator, timeout);
		
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public static void doSelectByValue(WebDriver driver, By locator,int timeout,String value) {
		WebElement  element = doGetElement(driver, locator, timeout);
		
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public static void doSelectByText(WebDriver driver, By locator,int timeout,String text) {
		WebElement  element = doGetElement(driver, locator, timeout);
		
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	

}
