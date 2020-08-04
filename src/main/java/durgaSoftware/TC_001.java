package durgaSoftware;

import java.io.IOException;

import org.apache.poi.hpbf.model.MainContents;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;

public class TC_001 extends BaseTest {
	
	
	public static void main(String[] args) throws IOException {
		   init();
		   launch("firefoxbrowser"); 
           navigateUrl("amazonurl");
		  System.out.println(driver.getTitle());
		 	
		/*
		 * driver.manage().window().maximize();
		 * 
		 * System.out.println(driver.getTitle());
		 * System.out.println(driver.getCurrentUrl());
		 * 
		 * Options option = driver.manage();
		 * 
		 * Navigation nav = driver.navigate();
		 * 
		 * TargetLocator locator= driver.switchTo();
		 * 
		 * driver.navigate().forward();
		 */
		 
	}

}
