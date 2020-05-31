package NSeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpecialDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(5000);
		
		WebElement ele = driver.findElement(By.id("msdd"));		
		ele.click();
		
		List<WebElement> list = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		
		System.out.println(list.size());
		
		for(WebElement l : list){
			System.out.println(l.getText());
			if(l.getText().equals("English")){
				l.click();
				break;
			}
		}

		
	}

}
