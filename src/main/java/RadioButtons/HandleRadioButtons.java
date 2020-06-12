package RadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleRadioButtons {
	
	
	@Test
	public void handleRadioButonsTest() {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang' and @type = 'radio']"));
		
		for (int i = 0; i < radio.size(); i++) {
			
			WebElement localRadio = radio.get(i);
			
			String value = localRadio.getAttribute("value");
			
			System.out.println("Values from radio button are ====>> "+value);
			
			if(value.equalsIgnoreCase("RUBY")) {
				localRadio.click();
			}
		}
	      driver.quit();
	}

}
