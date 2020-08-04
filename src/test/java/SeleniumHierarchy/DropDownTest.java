package SeleniumHierarchy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest {
	WebDriver driver;
	@Test
	public void verifyCountryDropDownValues() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php");
		
		WebElement countryDrop= driver.findElement(By.id("country"));
		
		Select select = new Select(countryDrop);
//		select.selectByIndex(3);
//		select.selectByValue("5");
//		select.selectByVisibleText("Anguilla");
		
		List<WebElement> dropOptions= select.getOptions();
		ArrayList<String> al = new ArrayList<>();
		
		
		for(WebElement e:dropOptions) {
			//System.out.println(e.getText());
			al.add(e.getText());
		}
		
		al.forEach(values->{
			System.out.println(values);
		});
		
		ArrayList tempList = new ArrayList<>();
		tempList.addAll(al);
		
		Collections.sort(tempList);
		
		System.out.println("---------");
		tempList.forEach(values-> {
			System.out.println(values);
			
		});
		
		Assert.assertEquals(al, tempList);
		
	}

}
