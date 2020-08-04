package SeleniumHierarchy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		//action.moveToElement(driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"))).click().build().perform();
		WebElement signin = driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
		action.moveToElement(signin).build().perform();
		System.out.println(signin.getText());
		System.out.println(signin.getAttribute("class"));

		
	}

}
