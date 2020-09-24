package SeleniumHierarchy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	
	static WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
          this.driver = driver;
	}

	
	public static WebElement getElement(By locator) {
		WebElement element =  driver.findElement(locator);
		return element;
	}
	
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
		
	}
	
	public static void doActionSendKeys(By locator,String value) {
		
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).sendKeys(value).build().perform();
	}
	
    public static void doSendValueWithAction(By locator,String value) {
		
		Actions action = new Actions(driver);
		WebElement element = getElement(locator);
		action.sendKeys(element, value).build().perform();
				
	}
    
    public void doClick(By locator) {
    	getElement(locator).click();
    }
	
    public void doActionClick(By locator) {
    	Actions action = new Actions(driver);
		WebElement element = getElement(locator);
		
		//action.moveToElement(element).click().build().perform();
		action.click(element).build().perform();
		
    	
    }
    
    public static String doGetText(By locator) {
    	WebElement element = getElement(locator);
    	return element.getText();
    }
    
    public void getDropDownValues(By locator) {
    	Select select = new Select(getElement(locator));
    	
    	List<WebElement> optionsList = select.getOptions();
    	System.out.println("Total values in drop down: "+optionsList.size());
    	
    	for(int i=0; i<optionsList.size(); i++) {
    		System.out.println(optionsList.get(i).getText());
    	}
    }
	
    
    public static void selectDropDown(By locator, int index) {
    	Select select = new Select(getElement(locator));
    	select.selectByIndex(index);
    }
    public static void selectDropDown(By locator, String value) {
    	Select select = new Select(getElement(locator));
    	select.selectByValue(value);
    }
    public static void selectDropDownByVisibleText(By locator, String text) {
    	Select select = new Select(getElement(locator));
    	select.selectByVisibleText(text);
    }
    
    public static void selectDropDownValue(By locator, String value) {
    	Select select = new Select(getElement(locator));
    	List<WebElement> optionsList= select.getOptions();
    	for(int i=0; i<optionsList.size() ; i++) {
    		String text = optionsList.get(i).getText();
    		if(text.equals(value)) {
    			optionsList.get(i).click();
    			break;
    		}
    	}
    }
	public static WebElement getElement(WebDriver driver, By locator){
		return driver.findElement(locator);
	}
    public static WebElement isElementPresent(WebDriver driver, By locator, int time) {
		WebElement final_element = null;
		for (int i = 0; i < time; i++) {
			try {
				final_element = getElement(driver, locator);
				break;
			} catch (Exception e) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					System.out.println("Waiting for element to appear on DOM");
				}
			}
		}
		return final_element;
	}
    public static List<WebElement> visibilityOfAllElements(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(locator)));


//		WebElement ele = wait.until(new Function<WebDriver, WebElement>() {
//
//			@Override
//			public WebElement apply(WebDriver driver) {
//								return driver.findElement(locator);
//			}
//		});
		return driver.findElements(locator);
		
	}
    public static WebElement waitForElementToBePresent(By locator, int timeout) {
    	WebDriverWait wait = new WebDriverWait(driver, timeout);
    	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    	return getElement(locator);
	}
    
    
    public static WebElement waitForElementToBeClickable(By locator, int timeout) {
    	WebDriverWait wait = new WebDriverWait(driver, timeout);
    	wait.until(ExpectedConditions.elementToBeClickable(locator));
    	return getElement(locator);
	}
    
    public static WebElement waitForElementVisibilityLocated(By locator, int timeout) {
    	WebDriverWait wait = new WebDriverWait(driver, timeout);
    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    	return getElement(locator);
	}
    
    public static WebElement waitForElementToBeVisible(By locator, int timeout) {
    	WebDriverWait wait = new WebDriverWait(driver, timeout);
    	wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
    	
    	return getElement(locator);
	}
    
    public static String waitForURL(String url, int timeout) {
    	WebDriverWait wait = new WebDriverWait(driver, timeout);
    	wait.until(ExpectedConditions.urlContains(url));
    	
    	return driver.getCurrentUrl();
	}
    
    public static boolean waitAlertToBePresent(String url, int timeout) {
    	WebDriverWait wait = new WebDriverWait(driver, timeout);
    	wait.until(ExpectedConditions.alertIsPresent());
    	
    	return true;
	}
    
    public static void clickWhenReady(By locator, int timeout) {
    	WebDriverWait wait = new WebDriverWait(driver, timeout);
    	wait.until(ExpectedConditions.elementToBeClickable(locator));
    	getElement(locator).click();
    	
	}
    
    public static boolean waitForTitleToBePresent(String title, int timeout) {
    	WebDriverWait wait = new WebDriverWait(driver, timeout);
    	wait.until(ExpectedConditions.titleContains(title));
    	return true;
       	
	}
    public static List<String> getDropDownValuesList(By locator) {
    	Select select = new Select(getElement(locator));
    	List<WebElement> optionsList= select.getOptions();
    	ArrayList<String> al = new ArrayList<>();
    	for(int i=0; i<optionsList.size(); i++) {
    		al.add(optionsList.get(i).getText());
    	}
    	return al;
    	
    }
    
    public static void doSelectValueFromDropDownWithoutSelect(String locator, String locatorValue, String value){
    	{
    		
    		List<WebElement> valuesList = null;
    		if(locator.equals("XPATH")) {
    			valuesList = driver.findElements(By.xpath(locatorValue));
    			
    		}
    		else if(locator.equals("CSS")) {
    			
    			valuesList = driver.findElements(By.cssSelector(locatorValue));
    		}
    		else {
    			System.out.println("Plese select correct locator strategy");
    		}
    		System.out.println(valuesList.size());
    		
    		for(int i =0; i<valuesList.size() ; i++) {
    			if(valuesList.get(i).getText().equals(value)) {
    				valuesList.get(i).click();
    				break;
    			}
    		}
    		
    		
    		
    }
    	
    	
    	
    }
}
