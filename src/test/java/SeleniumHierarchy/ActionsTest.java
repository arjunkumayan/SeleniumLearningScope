package SeleniumHierarchy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsTest {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.name("q"));
		
		//action.moveToElement(element).sendKeys("Arjun").build().perform();
		//action.moveToElement(element).sendKeys(Keys.SHIFT).sendKeys("Arjun").build().perform();

		action.keyDown(element,Keys.SHIFT).sendKeys("hhhhhhhhhh").build().perform();
		//action.keyUp(element, "heeee").build().perform();
		
		action.moveToElement(element).click().sendKeys("Arjun").build().perform();;
	}

}
