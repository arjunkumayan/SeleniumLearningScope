package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementNotInteractable {
	
	 public static void main(String[] args) throws Exception {  
		 WebDriverManager.chromedriver().setup(); 
	             
	           WebDriver driver = new ChromeDriver();  
	             
	           driver.get("https://learn.letskodeit.com/p/practice");  
	             
	           driver.manage().window().maximize();  
	             
	           //Clicking on the Hide button  
	           driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();  
	                       
	          // driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("text123"); // this line will throw error
	           //org.openqa.selenium.ElementNotInteractableException: element not interactable
	            
	   
	           // Through JavaScriptExecutor
	           
	           JavascriptExecutor js = (JavascriptExecutor)driver;  
	             
	           // Identifying the element using ID attribute and Entering the value in the text box  
	            js.executeScript("document.getElementById('displayed-text').value='text123'");  
	   
	      }  

}
