package SeleniumHierarchy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTipDemo1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		 	
		Actions action = new Actions(driver);
		
		WebElement link = driver.findElement(By.xpath("//div[@class='create-new-account']/a"));
		action.moveToElement(driver.findElement(By.xpath("//div[@class='create-new-account']/a"))).clickAndHold().build().perform();
		String text = link.getAttribute("title");
		if(text.equals("Create new Rediffmail account")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
			

	}

}
