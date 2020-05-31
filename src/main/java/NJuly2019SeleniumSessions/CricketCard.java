package NJuly2019SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketCard {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/8678/scorecard/1196265/bellary-tuskers-vs-bijapur-bulls-8th-match-karnataka-premier-league-2019");
		
		getPlayerScoreCard(driver, "SN Raju");
		getPlayerScoreCard(driver, "KC Cariappa");

		
	}
	
	
	public static void getPlayerScoreCard(WebDriver driver, String playerName){
		//System.out.println("getting score card for : "+ playerName + "\n");
		List<WebElement>scroresList = driver.findElements(By.xpath("//a[text()='"+playerName+"']//parent::div//following-sibling::div[@class='cell runs']"));
		//System.out.println(scroresList.size());
		
		for(int i=0; i<scroresList.size(); i++){
			System.out.print(scroresList.get(i).getText() + "\t");
		}
		System.out.println();

	}
	

}
