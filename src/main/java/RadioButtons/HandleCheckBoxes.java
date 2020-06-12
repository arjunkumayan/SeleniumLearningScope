package RadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBoxes {
	
	
	@Test
	public void handleCheckBoxTest() {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement> checkBoxs = driver.findElements(By.xpath("//input[@name='lang' and @type = 'checkbox']")); // it will match with 4 elements then click for RUBY
		
		for (int i = 0; i < checkBoxs.size(); i++) {
			
			WebElement localCheckBox = checkBoxs.get(i);
			
			String id = localCheckBox.getAttribute("id");
			
			System.out.println("Values from checkboxes are ====>> "+id);
			
			if(id.equalsIgnoreCase("code")) {
				localCheckBox.click();
				break;
			}
		}
	      driver.quit();
	}

}
