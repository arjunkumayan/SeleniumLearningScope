package com.framework.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageNewTest {
	
	static WebDriver driver;
	LoginPageNew loginPageObject;
	
	@BeforeClass
	public void setup() {
		
		driver = BrowserFactory.initilizeWebBrowser("chrome", "https://app.hubspot.com/");
		loginPageObject = PageFactory.initElements(driver, LoginPageNew.class);
		
		
	}
	
	@Test
	public void testCase1() throws InterruptedException {
		loginPageObject.loginToHubSpot("arjunkumaya@gmail.com", "Defence@5050");
	   System.out.println("Login test case passed");
	}
	
	@AfterClass
	public void down() {
		driver.quit();
	}
	

}
