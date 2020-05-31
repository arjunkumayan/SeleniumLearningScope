package NJuly2019SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		//xpath : address of element in DOM
		//1. absolute xpath: html/body/div/div[5]/div[2]/div[2]/li/div[1]/span/a
		//2. Relative xpath / Custom Xpath: 
			//a. properties of element
			//b. xpath functions
			//c. custom xpath syntax
			
		//htmltag[@attr1='value']
		//htmltag[@attr1='value' and @attr2='value']
		
		//input[@id='username']
		//input[@id='username' and @type]
		//input[@id='username' and @type='email']
		//button[@id='loginBtn' and @data-test-id='password-login-button']
		//input[@type='submit' and @value='Login']
		
		//contains(): is used for dynamic element properties
//		<input id=test_123 >
//		<input id=test_456 >
//		<input id=test_9876 >

		//input[contains(@id,'test_')]
		//input[contains(@id,'username')]
		//input[contains(@id,'username') and @type='email']
		
		//text()
		//a[text()='Sign up']
		//i18n-string[text()='Sign up']
		//a//i18n-string[text()='Sign up']
		
		//h2[text()]
		//h2[contains(text(),'That email address')]
		//input[starts-with(@id,'username')]
		//input[ends-with(@type,'email')]
		
		//position:
		//input[contains(@class,'form-control')] --2 
		// (//input[contains(@class,'form-control')])[1]
		// (//input[contains(@class,'form-control')])[2]
		// (//input[contains(@class,'form-control')])[position()=1]
		// (//input[contains(@class,'form-control')])[position()=2]
		
		//parent-child:
		//div[@class='private-form__input-wrapper']/input[@id='username'] -- direct child
		//div[@class='private-form__input-wrapper']//input[@id='username'] -- inirect child
		
		//div/input --2
		//div//input --3
		
		//div[@class='private-form__input-wrapper']//following::input[@id='password']
		//div[@class='private-form__input-wrapper']/following::input[@id='password']
		
		//input[@name='username']/../../../../..
		//input[@name='username']//parent::div
		//input[@name='username']//parent::div//parent::form
		
		//a[text()='Naveen K']//parent::td//preceding-sibling::td/input[@type='checkbox']
		//tr[18]//td[1]//input[1]
		
		// (//input[@type='text'])[last()]
		
		//xpath Axes:
		//a[text()='SN Raju']//parent::div//following-sibling::div
		//a[text()='SN Raju']//parent::div//following-sibling::div[@class='cell runs']
		//a[text()='SN Raju']//ancestor::td
		//a[text()='Naveen K']//parent::td//preceding-sibling::td/input[@type='checkbox']
		//a[text()='SN Raju']//ancestor::td//ancestor::tbody

	}

}
