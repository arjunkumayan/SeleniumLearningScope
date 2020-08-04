package SeleniumHierarchy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("justAnInputBox")));
		WebElement dropdown = driver.findElement(By.id("justAnInputBox"));
		WebElement dropdown1 = driver.findElement(By.xpath("//input[@id='justAnInputBox']"));
		dropdown1.click();
		//Actions action = new Actions(driver);
		//action.moveToElement(dropdown).click().build().perform();
		
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click()", dropdown);
		//div[@class='comboTreeDropDownContainer']//ul/li/span[@class='comboTreeItemTitle']

		// selectChoiceValues(driver, "choice 6 2 1","choice 6 2 2","choice 6 2 3");
		//selectChoiceValues(driver, "choice 2 3");
		//selectChoiceValues(driver, "choice 6 2 3");
		 selectChoiceValues(driver, "ALL");
			
	}
	
	public static void selectChoiceValues(WebDriver driver, String... value) {
		List<WebElement> choiceList = null;
		 choiceList= driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul/li/span[@class='comboTreeItemTitle']"));
		if(!value[0].equalsIgnoreCase("ALL")) {
		 	for(int i=0; i<choiceList.size(); i++) {
			String text = choiceList.get(i).getText();
			System.out.println(text);
			
			for(int k=0; k<value.length; k++) {
				if(text.equals(value[k])) {
					choiceList.get(i).click();
					break;
				}
			}
			/*
			 * if(text.equals(value)) { choiceList.get(i).click(); // break; }
			 */
		}
		}
		else {
			try {
			for(int j=0; j<choiceList.size(); j++) {
				choiceList.get(j).click();
			}}
			catch(Exception e) {
				}
			
		}
	}

}
