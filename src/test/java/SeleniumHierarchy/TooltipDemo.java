package SeleniumHierarchy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TooltipDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tool-tips");
		
		Actions action = new Actions(driver);
		
	WebElement hover=driver.findElement(By.id("toolTipButton"));
	 System.out.println(hover.getText());
		

	action.moveToElement(hover).build().perform();
	
	}

}
