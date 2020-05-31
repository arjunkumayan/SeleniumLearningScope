package PageTest;

import static org.testng.Assert.assertTrue;

import java.awt.event.ActionEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BSPageFlowTest {
	WebDriver driver;	
	
	public void clickElementByJS(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}
	
	public void scrollIntoView(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	
	By freeTrialLink = By.xpath("//a[text()='Free Trial']");
	By username = By.id("user_full_name");
	By userEmail = By.id("user_email_login");
	By password = By.id("user_password");
	By tncCheckBox = By.id("tnc_checkbox");
	By signMeUpButton = By.id("user_submit");
	By hashId = By.xpath("(//pre[@class=' prettyprint__snippet-container'])[3]//span[@class='str']/span");
	
	@BeforeSuite
	public void setUp()	{		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.browserstack.com/users/sign_in");		
		//driver.get("https://www.browserstack.com/users/sign_in");
		driver.get("https://app-automate.browserstack.com/");
	}
	
	@Test(priority=1,enabled=false)
	public void signInFlowTest() throws InterruptedException {		
	driver.findElement(freeTrialLink).click();	
	driver.findElement(username).sendKeys("Arjun Singh");
	driver.findElement(userEmail).sendKeys("arjunkumaya@gmail.com");
	driver.findElement(password).sendKeys("Temp@1234");
	Thread.sleep(5000);
	WebElement checkBoxElement  = driver.findElement(tncCheckBox);
	
	Actions action = new Actions(driver);
	action.moveToElement(checkBoxElement).click().build().perform();
	//clickElementByJS(checkBoxElement,driver);
	driver.findElement(signMeUpButton).click();
		
	}
	
	@Test(priority =2)
	public void signInToAppTest() {
		
		driver.findElement(userEmail).sendKeys("arjunkumaya@gmail.com");
		driver.findElement(password).sendKeys("Temp@1234");
		WebElement signInButton = driver.findElement(signMeUpButton);
		Actions action = new Actions(driver);
		
		//WebElement checkBoxElement  = driver.findElement(tncCheckBox);
		//action.moveToElement(checkBoxElement).click().build().perform();
		//action.moveToElement(signInButton).click().build().perform();
		
		clickElementByJS(signInButton,driver);
//		Set<String> handles = driver.getWindowHandles();
//		
//		Iterator<String> itr= handles.iterator();
//		String parentWindow = itr.next();
//		String childWindow =  itr.next();
//		
//		driver.switchTo().window(childWindow);
//		driver.close();
//		driver.switchTo().window(parentWindow);
//		action.moveToElement(signInButton).click().build().perform();
		
	}
	@Test(priority =3)
	public void verifyPageActions() {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleIs("Run Selenium Tests in 2000+ Desktop and Mobile Browsers"));
		driver.findElement(By.xpath("//div[text()='Appium']")).click();
		driver.findElement(By.xpath("//li[text()='RUBY']")).click();;
		
		WebElement ruby =  driver.findElement(By.id("file"));
		scrollIntoView(ruby, driver);
		Actions action = new Actions(driver);
		String path = System.getProperty("user.dir");
		ruby.sendKeys(path+"/src/test/testData/ThrottleFast.apk");
		
		//action.moveToElement(ruby).sendKeys(path+"/src/test/testData/ThrottleFast.apk");
		
		String hashIdText = driver.findElement(hashId).getText();
		int len = hashIdText.length();
		
		
	}
		
	  @AfterSuite public void tearDown() {
		  driver.quit(); }
	 
	
	
	
	

}
