package NJuly2019SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");		
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		//h2[contains(text(),'Title bar')]
		//body > h2
		
		//WebElement header = driver.findElement(By.cssSelector("body > h2"));
		WebElement header = driver.findElement(By.xpath("//h2[contains(text(),'Title bar')]"));

		System.out.println(header.getText());
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.getTitle());
		
		
	}

}
