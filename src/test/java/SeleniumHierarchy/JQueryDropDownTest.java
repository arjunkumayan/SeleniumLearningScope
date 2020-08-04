package SeleniumHierarchy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDownTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		//driver.findElement(By.xpath("//button[@id='comboTree679729ArrowBtn']/span[@class='comboTreeArrowBtnImg']")).click();
         driver.findElement(By.id("justAnInputBox")).click();

         // //input[@id='justAnInputBox']/parent::div//following-sibling::div//ul//li
         
         driver.findElement(By.xpath("//input[@id='justAnInputBox']/parent::div//following-sibling::div//ul//li"));

	}

}
