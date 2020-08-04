package SeleniumHierarchy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsExample {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://login.yahoo.com/account/create?src=noSrc&specId=yidReg");
		
		
		WebElement username = driver.findElement(By.id("usernamereg-firstName"));
		
		Actions action = new Actions(driver);
		action.keyDown(username, Keys.SHIFT).sendKeys("arjun").keyUp(Keys.SHIFT).build().perform();
	
		action.sendKeys(driver.findElement(By.id("usernamereg-lastName")), "singh").build().perform();
	//	action.moveToElement(driver.findElement(By.id("gender-container"))).sendKeys("male").build().perform();
		//action.click(driver.findElement(By.id("reg-submit-button"))).build().perform();
		
		action.moveToElement(driver.findElement(By.id("reg-submit-button"))).click().build().perform();
		
		
	}

}
