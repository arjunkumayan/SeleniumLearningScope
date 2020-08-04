package SeleniumHierarchy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayedAndIsSelectedAndIsEnabled {
//Difference between isDisplayed(), isEnabled() and isSelected() Methods in Selenium WebDriver:
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://register.rediff.com/register/register.php");

		// 1. isDisplayed() Applicaable for all elements
		Boolean b1 = driver.findElement(By.id("Register")).isDisplayed();
		System.out.println(b1);

		// 2. isEnabled() - if the element is disabled means not able to click it then
		// it is disabled
		Boolean b2 = driver.findElement(By.id("Register")).isEnabled();
		System.out.println(b2);

		// 3. isSelected() - checkbox, radiobutton,dropdown
		Boolean beforeSelected = driver
				.findElement(
						By.xpath("//div[@id='altid_msg']/parent::td//preceding-sibling::td/input[@type='checkbox']"))
				.isSelected();

		System.out.println("Before:+" + beforeSelected);

		driver.findElement(By.xpath("//div[@id='altid_msg']/parent::td//preceding-sibling::td/input[@type='checkbox']"))
				.click();
		Boolean afterSelected = driver
				.findElement(
						By.xpath("//div[@id='altid_msg']/parent::td//preceding-sibling::td/input[@type='checkbox']"))
				.isSelected();
		
		
		System.out.println("after:+" + afterSelected);
		
	Boolean display =	driver
		.findElement(
				By.xpath("//div[@id='altid_msg']/parent::td//preceding-sibling::td/input[@type='checkbox']"))
		.isDisplayed();
	
	System.out.println("displayed : "+display);
	Boolean enabled = 	driver
		.findElement(
				By.xpath("//div[@id='altid_msg']/parent::td//preceding-sibling::td/input[@type='checkbox']"))
		.isEnabled();
	
	System.out.println("enabled : "+enabled);
	}

}
