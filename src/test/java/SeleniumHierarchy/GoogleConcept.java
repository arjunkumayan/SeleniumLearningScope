package SeleniumHierarchy;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleConcept {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Gmail']"));
        System.out.println(element.getText());
        System.out.println(element.getAttribute("href"));
        System.out.println(element.getAttribute("data-pid"));
        System.out.println(element.getCssValue(""));
        System.out.println(element.getTagName());
        System.out.println(element.isDisplayed());
        System.out.println(element.isEnabled());
        System.out.println(element.isSelected());
        System.out.println(element.getLocation());
        System.out.println(element.getRect().height);
        System.out.println(element.getRect().width);
        System.out.println(element.getRect().x);
        System.out.println(element.getRect().y);
        System.out.println(element.getRect().getPoint());
        System.out.println(element.getRect().getDimension());
        System.out.println(element.getRect().getX());
        System.out.println(element.getRect().getY());
        System.out.println(element.getSize());
       // System.out.println(element.getScreenshotAs((OutputType<X>) new File("")));
        
        element.clear();
        element.submit();
        element.click();
        element.sendKeys("Helllo@123");
        System.out.println(element.getRect().height);
        driver.quit();
        
        Select select = new Select(driver.findElement(By.id("")));
        List<WebElement> dropDownOptionss= select.getOptions();
        select.selectByIndex(1);
        select.selectByValue("Arjun");
        select.selectByVisibleText("This is first radio button");
        select.deselectByIndex(1);
        select.deselectByIndex(2);
        select.deselectByValue("Hello");
        select.deselectByVisibleText("This is text based here");
        List<WebElement> options = select.getAllSelectedOptions();
        select.getWrappedElement();
        select.isMultiple();
        
        
        Actions action = new Actions(driver);
        action.click().build().perform();
        action.moveToElement(driver.findElement(By.xpath(""))).click().build().perform();
        action.moveToElement(driver.findElement(By.xpath(""))).contextClick().build().perform();
        action.moveToElement(driver.findElement(By.xpath(""))).doubleClick();
        action.doubleClick(driver.findElement(By.xpath(""))).build().perform();
        
        action.dragAndDrop(driver.findElement(By.xpath("source")), driver.findElement(By.xpath("target"))).build().perform();
        
        action.moveToElement(driver.findElement(By.xpath(""))).release().build().perform();
        
        action.moveToElement(driver.findElement(By.id(""))).clickAndHold().release().build().perform();
        
        action.moveToElement(driver.findElement(By.cssSelector(""))).sendKeys("ARjun");
        
        action.moveToElement(driver.findElement(By.name(""))).sendKeys(Keys.ENTER);
        action.moveToElement(driver.findElement(By.name(""))).sendKeys(Keys.ARROW_DOWN);
        action.moveToElement(driver.findElement(By.name(""))).sendKeys(Keys.ARROW_RIGHT);
        action.moveToElement(driver.findElement(By.name(""))).sendKeys(Keys.BACK_SPACE);
        action.moveToElement(driver.findElement(By.name(""))).sendKeys(Keys.CANCEL);
        action.moveToElement(driver.findElement(By.name(""))).sendKeys(Keys.SHIFT).sendKeys("Arjun");
        action.moveToElement(driver.findElement(By.name(""))).sendKeys(Keys.valueOf("Arjun"));
        action.moveToElement(driver.findElement(By.name(""))).sendKeys(Keys.SPACE);
        
       // action.tick(driver.findElement(By.xpath("")).click());
        
        action.keyUp("Arjun");
        
        
        
	}

}
