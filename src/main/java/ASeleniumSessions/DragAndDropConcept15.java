package ASeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept15 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
			
		//driver.switchTo().defaultContent();
		
		Actions action = new Actions(driver);
		
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		
		action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
//		action.dragAndDrop(sourceElement, targetElement).build().perform();
//		action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
//		action.clickAndHold(sourceElement).release(targetElement).build().perform();
		
	   
		
		
	}

}
