package ASeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept15 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.get("http://mrbool.com");
		
		Actions action = new Actions(driver);
		
	WebElement contentLink =	driver.findElement(By.className("menulink"));
		
	Actions actionContent = action.moveToElement(contentLink);
	actionContent.build().perform();
	
	Thread.sleep(5000);
		
	//build - collect the actions (how many action are available ) and then perform	
	
		
				driver.findElement(By.xpath("//ul[@class='submenu']//a[text()='Courses']")).click();
		
		//action.moveToElement(course).click().build().perform();
	}

}
