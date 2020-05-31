package ASeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownS8 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree");
		
		
		//h3[text()='Multi Selection']/parent::div/div/div[@class='comboTreeDropDownContainer']//ul/li/span[@class='comboTreeItemTitle']
		//input[@id='justAnInputBox']
		By checkboxDropDown = By.xpath("//input[@id='justAnInputBox']/parent::div//span[@class='comboTreeArrowBtnImg']");
		//input[@id='justAnInputBox']/parent::div//span[@class='comboTreeArrowBtnImg']
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(checkboxDropDown));
		
		driver.findElement(checkboxDropDown).click();
		
		//List<WebElement> choiceList = driver.findElements(By.xpath("//h3[text()='Multi Selection']/parent::div/div/div[@class='comboTreeDropDownContainer']//ul/li/span[@class='comboTreeItemTitle']/input"));
		//ul//li/span[@class='comboTreeItemTitle']
		//input[@id='comboTree230123MultiFilter']/parent::div//ul//li/span[@class='comboTreeItemTitle']
		
		
	//	selectChoiceValues(driver, "choice 1");
	//	selectChoiceValues(driver, "choice 2 3");
	//	selectChoiceValues(driver, "choice 6 1");
		
		//selectChoiceValues(driver, "choice 1","choice 2 3","choice 6 1");
		//selectChoiceValues(driver, "choice 6 1");
		//String Str[]= {"choice 1","choice 2 3","choice 6 1"};
		
		
		selectChoiceValues(driver, "ALL");
	}

	//public static void selectChoiceValues(WebDriver driver, String value[])
	public static void selectChoiceValues(WebDriver driver, String... value)
	{
		List<WebElement> choiceList = driver.findElements(By.xpath("//ul//li/span[@class='comboTreeItemTitle']"));
		//System.out.println("total checkbox count: "+choiceList.size());

		if(!value[0].equalsIgnoreCase("ALL"))
		{
			for(int i=0 ;i<choiceList.size() ;i++)
			{
				String text = choiceList.get(i).getText();
				for(int k=0 ;k<value.length ;k++)
				{
				if(text.equals(value[k]))
				{
					System.out.println(text);	
					//alist.add(text);
					choiceList.get(i).click();
					break;
				}
				}
				
			}
			
		}
		// select all the values
		else
		{
			try {
				
			
			for(int all=0; all<choiceList.size() ; all++)
			{
				choiceList.get(all).click();
			}
			}
			catch(Exception e)
			{
				
			}
		}
		
		
		
		
	}
}
