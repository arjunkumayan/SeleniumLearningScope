package ASeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept16 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions action = new Actions(driver);
		
		WebElement  rightClickElement = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
	//	action.moveToElement(rightClickElement).contextClick().build().perform();
		
		action.contextClick(rightClickElement).build().perform();
		
		//ul[@class='context-menu-list context-menu-root']/li/span
		
		String text = driver.findElement(By.xpath("//span[contains(text(),'Copy')]//parent::li/child::span")).getText();
		System.out.println(text);
		
		
	}

}
