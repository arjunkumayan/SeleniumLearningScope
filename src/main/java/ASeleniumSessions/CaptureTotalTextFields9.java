package ASeleniumSessions;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureTotalTextFields9 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php");
		
		List<WebElement> listInput = driver.findElements(By.tagName("input"));
		
		
		/*
		 * ListIterator<WebElement> elements = listInput.listIterator();
		 * 
		 * while(elements.hasNext()) { System.out.println(elements.next().getText()); }
		 */
		
		System.out.println(listInput.size());
		
		List<WebElement> listInputText = driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println(listInputText.size());
		
		for(int i=0; i<listInputText.size() ; i++)
		{
			listInputText.get(i).sendKeys("Arjun Singh");
		}
	}

}
