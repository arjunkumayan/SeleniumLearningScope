package ASeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalPageLinksExample8 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		//div[@id='navFooter']//div[@role='presentation']/div//ul/li
		
		//div[@id='navFooter']//div[@role='presentation']//div[text()='Get to Know Us']/parent::div/ul/li

	
		List<WebElement> linksFooter= driver.findElements(By.xpath("//div[@id='navFooter']//div[@role='presentation']/div//ul/li"));
	
		for(int i=0 ; i<linksFooter.size() ; i++)
		{
		System.out.println(linksFooter.get(i).getText());			
		}
	}

}
