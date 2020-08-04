package SeleniumHierarchy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonImageCount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		List<WebElement> imageList = driver.findElements(By.tagName("img"));

		List<String> imageUrl = new ArrayList<String>();
		for(WebElement e: imageList) {
			imageUrl.add(e.getAttribute("src"));
			///System.out.println(imageUrl);
		}
		
		imageUrl.forEach(valuest ->{
			System.out.println(valuest);
			
		});
	}

}
