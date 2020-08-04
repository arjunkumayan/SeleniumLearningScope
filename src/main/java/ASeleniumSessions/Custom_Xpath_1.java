package ASeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath_1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://app.hubspot.com");
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 
		 
		 //htmlTag[@prop1='value1']
		 //htmlTab[@prop1='value1'][@prop2='value1']
		//input[@id='username']
		//input[@id='username'][@type='email']
		//input[@id='username' and @type='email']
		//input[@id='username' or @type='email']
		//input[@id='username' or @type='email']/parent::div/preceding::div/parent::div[@class='private-form__control-wrapper']
		//input[@class='form-control private-form__control login-email']
		 
		 
		 // Contains in Xpath
		//input[contains(@class,'login-email')]
		//div[contains(@class,'private-form__meta')]
		//*[contains(@id,'username')]
		//input[@id='username' and contains(@class,'form-control private-form__control')]
		 
		//input[@id='username' and contains(@class,'')]
		 
		 // contains also used for dynamic ids
		 
		 // Username_012
		 //Username_013
		 //username_014
		 
	//	 <input id='Username_012'>
	//	 <input id='Username_014'>
	//	 <input id='Username_015'>
		//input[contains(@id,'username_')]
		 
		//input[contains(@class,'form-control')]
		 
		 // Index options
		 
		// ->  (//input[contains(@class,'form-control')])[1]
		//->   (//input[contains(@class,'form-control')])[2]
		 
		 
		 // position function
		 
		 // -> (//input[contains(@class,'form-control')])[position()=1]
		//->   (//input[contains(@class,'form-control')])[position()=2]
		 
		 // last() 
		 
		 //-> (//input[contains(@class,'form-control')])[last()]  - it will move to last element
		 
		 
		 //      (//i18n-string)
		 //      (//i18n-string)[1]
		 //		 (//i18n-string)[position()=1]
		 //		 (//i18n-string)[last()]
		 
		 // Text() - xpath with Text() 
		 
		 //htmlTag[text()='value']
		 //htmlTag[contains(text(),'value')]
		 
		//span[text()='Show Password']
		 
		//i18n-string[text()='Don't have an account?']
		//i18n-string[text()='Forgot my password']
		 
		//span[contains(text(),'Show Password')]
		 
		 // Best use of contains - text contains only show password or show username
		//span[contains(text(),'Show')]
		 //i18n-string[contains(text(),'account?')]
		 
		//h1[contains(text(),'Sales Dashboard')]
		 
		//h1[@class='private-page__title']
		 
		 // starts with Text()
		//div[starts-with(@class,'navAccount-accountName')]
		//h1[starts-with(@class,'private-page')]
		//h1[starts-with(text(),'Sales')]
		//h1[ends-with(text(),'Dashboard')]
		 
		//*[@id='username']
		 
		//div//input  - indirect + direct child - 3 values
		//div/input  - immediate - direct child - 2 values
		 /*
		  * 
		  * 
		  * 
		  */
		WebElement emailId = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("loginBtn"));
		 
		 Actions action = new Actions(driver);
		
		 
		 action.moveToElement(emailId).sendKeys("arjunkumayan18@gmail.com").build().perform();
		// action.moveToElement(password).sendKeys("Defence@5050").build().perform();
		 action.sendKeys(password, "Defence@5050").build().perform();
		 
		
		 
		// action.moveToElement(login).sendKeys("arjunkumayan18@gmail.com").build().perform();
		 
		 action.click(login).build().perform();
		 
		 String headerValue = driver.findElement(By.xpath("//h1[@class='private-page__title']")).getText();
		 
		 System.out.println(headerValue);
		 
	System.out.println( driver.findElement(By.xpath("//h1[contains(text(),'Sales Dashboard')]")).isDisplayed());
		 
	// starts-with function
	
	
	
	
			
		
					
			WebElement accountMenu= 		driver.findElement(By.xpath("//a[@id='account-menu']"));
			WebElement accountName= 		driver.findElement(By.xpath("(//div[@class='navAccount-accountName'])[1]"));
			WebElement accountID= 		driver.findElement(By.xpath("(//div[@class='navAccount-portalId'])[1]"));
	
			action.moveToElement(accountMenu).click().build().perform();
		if(accountName.getText().equalsIgnoreCase("arjuntest"))
		{		
			System.out.println("correct-name");
		}
		if(accountID.getText().equalsIgnoreCase("6320639"))
		{		
			System.out.println("correct-id");
		}
			
	}

	
}
