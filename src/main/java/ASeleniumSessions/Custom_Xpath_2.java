package ASeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath_2 {

	public static void main(String[] args) {
		
		/*
		 * Absolute Xpath and Relative Xpath
		 * Absolute - top to bottom hierarchy - complete hierarchy //html//div//input  - it has id
		 * Relative Xpath - //input[@id='username'] 
		 * 
		 * Absoulute xpath is not preferable because if one path is changed then completely all path will be disurbed
		 * 
		 */

		//1.  FOLLOWING concept
		
		
		//div[@class='private-form__input-wrapper']/following::div   - it has all the 13 count- becuse
		//  Following will take all the path from current element to down - include child elements plus the  
		//div[@class='private-form__input-wrapper']/following-sibling::div  - it has only 2 
		
		//div[@class='input-group']/input[@name='username']
		//div[@class='private-form__input-wrapper']/input[@id='username']
		
		//div[@class='input-group']/input
		//div[@class='input-group']//following::input  - // direct + Indirect child
		
		// - / means - immediate child
		// - // means - direct + indirect child
		
	//	<div class ="input-group">
	//	    <input name="username">
	//	    <input name="username">
	//	<div class ="input-group=btn">   
	//	<input name="btn">
		//div[@class='input-group']//following::input[@name='username'] - it will give you all the input tag which matches the condition
		
		
		
		//2.preceding concept
		
		//input[@name='username']//preceding::div
		//input[@name='username']/preceding::div
		//input[@name='username']//preceding::div[1]
		//input[@name='username']//parent::div
		//input[@name='username']//parent::div//following::div[@class='input-group-btn']/child::input
		//input[@id='password']//preceding::div
		
		//3. Child
		//div[@class='input-group']//child::input - 1 of 3
		//div[@class='input-group']/child::input - 1 of 2
		
		//4. parent
		//div[@class='input-group']//child::input//parent::div
		
		//5. ancestor
		//div[@class='input-group']/ancestor::div
		//div[@class='private-form__input-wrapper']/ancestor::div  -> it will only give you the parent tag count which matches the div not the child tag
				
		//span[text()='arjun singh']//preceding::td
		
		// 6. preceding-sibling
		//span[text()='arjun singh']//ancestor::td//preceding-sibling::td//following::input

		// Contains - xpath
		//span[contains(text(),'Show Password')]

		//input[contains(@id,'username')]
		
		//span[text()='arjun singh']//ancestor::td//preceding-sibling::td//input
		//span[text()='arjun singh']//ancestor::td//preceding-sibling::td/child::div/label/span//input[@class='private-checkbox__input sr-only']
		
		//span[text()='arjun singh']//ancestor::td//preceding-sibling::td//input
		
		
		//7. following siblilng  -
		
		// preceding -sibling and following sibling - these should have the same parent tags
		
		
		// 8. Reversing Xpath
		
		/*
		 * traversing from child to parent -> grant parent -> super parent --> top parent in dom
		 * //input[@id='username']//..
		 * //input[@id='username']/parent::div
		 * //input[@id='username']/../../../../..
		 * //input[@id='username']/..
		 * driver.findElement(By.className("//input[@id='username']/../../../../..")).getAttribute("id");
		 */
		
		
		
		
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://app.hubspot.com");
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 // Write code to move to contacts
		 
		 Actions action =new Actions(driver);
		 action.sendKeys(driver.findElement(By.id("username")), "arjunkumayan18@gmail.com").build().perform();
		 action.sendKeys(driver.findElement(By.id("password")), "Defence@5050").build().perform();
		 action.click(driver.findElement(By.id("loginBtn"))).build().perform();
		 selectcheckBox(action, driver, "arjun singh");
		 
		// driver.findElement(By.className("")).getAttribute("");
	}

	public static void selectcheckBox(Actions action, WebDriver driver, String contactName)
	{
       action.click(driver.findElement(By.xpath("//span[text()='"+contactName+"']//ancestor::td//preceding-sibling::td//input"))).build().perform();
	}
}
