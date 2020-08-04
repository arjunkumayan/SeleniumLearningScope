package com.framework.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew {

	WebDriver driver;
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(how=How.XPATH,using="//input[@id='password']")
	WebElement password;
	
		
	@FindBy(id="loginBtn")
	WebElement loginButton;
	
	
	public LoginPageNew(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void loginToHubSpot(String user,String pass) throws InterruptedException {
		Thread.sleep(5000);
		username.sendKeys(user);
		password.sendKeys(pass);
		loginButton.click();
	}
	
	
	
}
