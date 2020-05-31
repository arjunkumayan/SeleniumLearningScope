package ASeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalPageLinks8 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		 // List - based on indexing - order bases
		// store duplicates 
		
		System.out.println("Total links: "+linksList.size());
		ArrayList<String> alist=new ArrayList<String>();
		for(int i=0; i<linksList.size() ; i++)
		{
			String text = linksList.get(i).getText();
			/*
			 * if(!text.startsWith(" ")) { System.out.println(text); }
			 */
			if( !(text.isEmpty() || text.equals(null) || text.startsWith(" ")))
					{
				System.out.println(text);
					}
			
			
			
			alist.add(text);
			//System.out.println(linksList.get(i).getText());

			//linksList.get(i);
			
		}
		
		//ArrayList<String> alist=new ArrayList<String>();
		
	}

}
