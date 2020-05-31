package NSeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageCount {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		//get total number of images on the page
		
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		System.out.println("total images : " + imagesList.size());
		
		for(int i=0; i<imagesList.size(); i++){
			System.out.println(imagesList.get(i).getAttribute("src"));
		}
		
		
	}

}
