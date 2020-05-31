package ASeleniumSessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricScoreBoard2 {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		 String url="https://www.espncricinfo.com/series/19304/scorecard/1187029/india-vs-australia-3rd-odi-australia-tour-of-india-2019-20";
		
		 driver= launchBrowser(url);
		 waitforImplicitWait(driver,15);
		 List<String>  playerScoreListCard = getPlayerCricketRecords(driver, "M Labuschagne");
		 
		 
		 for(int i=0; i<playerScoreListCard.size(); i++)
		 {
			 if(playerScoreListCard.size()<7)
			 {
				 String text = playerScoreListCard.get(i);
				 System.out.print(text + " "+ "\t");
			 }
			 else
			 {
				 System.out.println();
			 }
		 }
		 
		/*
		 * Iterator<String> itr= playerScoreListCard.iterator();
		 * 
		 * while(itr.hasNext()) {
		 * 
		 * System.out.print(itr.next() + " "+ "\t"); }
		 */
	}
	
	public static List<String> getPlayerCricketRecords(WebDriver driver, String playerName)
	{
		List<WebElement> scoreList = driver.findElements(By.xpath("//div[@id='gp-inning-00']/div/div[@class='flex-row']/div[contains(@class,'wrap')]/div"));
		
		 System.out.println(scoreList.size());
		 
		 ArrayList<String> alist = new ArrayList<String>();
		 
		 for(int i=0; i<scoreList.size(); i++)
		 {
			String text = scoreList.get(i).getText();
			alist.add(text);
			//System.out.print(text+ " "+ "\t");
		 }
		 return alist;
	}
	
	public static WebDriver launchBrowser(String url)
	{
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get(url);
		return driver;
	}

	
	public static void waitforImplicitWait(WebDriver driver, int timeOut)
	{
		 driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
	}
}
