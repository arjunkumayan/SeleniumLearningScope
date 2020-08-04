package SeleniumHierarchy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectTest {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/account/create?src=noSrc&specId=yidReg");
		Select select = new Select(driver.findElement(By.id("usernamereg-month")));
		
		//select.selectByIndex(1);
		//select.selectByValue("5");
		select.selectByVisibleText("June");
		
	    select.getFirstSelectedOption();
	    
	    select.getAllSelectedOptions();
		
	    List<String> listText = new ArrayList<String>();
   List<WebElement> option =  select.getOptions();
     System.out.println(option.size());
       for(int i=0 ;i<option.size() ; i++) {
	   String text = option.get(i).getText();
	   System.out.println(text);
	   listText.add(text);
       }
       
       listText.forEach((values)->System.out.println(values));
    
       
	}

}
