package N2020SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
				
		ElementUtil ele = new ElementUtil(driver);
		List<WebElement> linksList = ele.visiblilityOfAllElements(By.xpath("//div[@id='SIvCob']/a"), 5);
		
		System.out.println(linksList.size());
		
		for(int i=0; i<linksList.size(); i++){
			String text = linksList.get(i).getText();
			System.out.println(text);
			linksList.get(i).click();
			linksList = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		}
		
	}

}
