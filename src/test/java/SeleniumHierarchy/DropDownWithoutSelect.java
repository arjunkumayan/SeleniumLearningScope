package SeleniumHierarchy;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

	static WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php");
		
		List<WebElement> ele = driver.findElements(By.xpath("//td[text()='Date of Birth']/parent::tr//select[1]/option"));

		ArrayList<String> al= new ArrayList<>();
		for(WebElement element:ele) {
			al.add(element.getText());
			
		}
		al.forEach(value->{
			System.out.println(value);
		});
	}

}
