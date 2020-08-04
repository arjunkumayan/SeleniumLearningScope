package SeleniumHierarchy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		 	
		Actions action = new Actions(driver);
		
		WebElement link = driver.findElement(By.name("proceed"));
		action.moveToElement(link).click().build().perform();
		
		String text = driver.switchTo().alert().getText();
				
		if(text.equals("Please enter a valid user name")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		driver.switchTo().alert().accept();
			

	}

}
