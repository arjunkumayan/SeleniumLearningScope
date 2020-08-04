package SeleniumHierarchy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectTestWithout {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://login.yahoo.com/account/create?src=noSrc&specId=yidReg");
	
	   List<WebElement> optionsList= driver.findElements(By.xpath("//select[@id='usernamereg-month']/option"));
	
	   List<String> list = new ArrayList<String>();
	   List<String> Expectedlist = new ArrayList<String>();
	   
	   for(int i=0 ; i<optionsList.size() ; i++) {
		   
		   String text = optionsList.get(i).getText();
		   System.out.println(text);
		   
			/*
			 * if(text.equals("November")) { optionsList.get(i).click(); }
			 */
		   list.add(text);
		  
	   }
	   Expectedlist.addAll(list);
	   Collections.sort(Expectedlist);
	   
	   Assert.assertEquals(list, Expectedlist);
	   Assert.assertTrue(list.equals(Expectedlist));
	}

}
