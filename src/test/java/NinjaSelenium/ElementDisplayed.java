package NinjaSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDisplayed {
	
	// There my be multiple ways a element is hidden
	
	// Element being displayed/hidden or completely in hidden state or Completely non existant on the DOM
	//1 . Element is disabled
	//2. Element is there but loaded when perform some operation
	 // Like click on one button the some text is displayed

	
	// some website just disable from the UI but it is present in the DOM- so you can use isDisplayed() or isEnabled()
	// but some website totally hide it not present in the DOM but clicking on some thing it displays the Element
	
	
	
	private WebDriver driver;
	String baseUrl1;
	String baseUrl2;
	
	
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		baseUrl1="https://letskodeit.teachable.com/p/practice";
		baseUrl2 = "https://www.expedia.co.in/";
	}
	@Test
	public void testLetsKodeIt() throws InterruptedException {
		driver.get(baseUrl1);
		
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		System.out.println("Text Box Displayed: "+textBox.isDisplayed());
		
		
		Thread.sleep(2000);
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		System.out.println("Clicked on hide button");
		System.out.println("Text Box Displayed: "+textBox.isDisplayed());
		
		Thread.sleep(3000);
		WebElement showButton = driver.findElement(By.id("show-textbox"));
		showButton.click();
		System.out.println("Clicked on Show button");
		System.out.println("Text Box Displayed: "+textBox.isDisplayed());
		Thread.sleep(3000);
	}
	
	@Test
	public void testExpedia() throws InterruptedException {
		
		// Here Element is there only after clicking on the button so otherwise it will give you NoSuchElementException so better to use - FindElements()
		driver.get(baseUrl2);
		
		Thread.sleep(2000);
//		WebElement hotelButton = driver.findElement(By.id("tab-hotel-tab-hp"));
//		hotelButton.click();
		
		WebElement staysButton = driver.findElement(By.xpath("(//a[@class='uitk-tab-anchor'])[1]"));
		staysButton.click();
		System.out.println("Clicked on stays Button");
		
		WebElement travelerElement = driver.findElement(By.xpath("//div[@class='uitk-experimental-adaptive']//button[@data-testid='travelers-field-trigger']"));
		travelerElement.click();
		System.out.println("Clicked on traveler button");

		Thread.sleep(2000);
        System.out.println("Check element displayed before clicking on the Increase button - noSuch element Exception");
		//WebElement hiddenElement = driver.findElement(By.xpath("//select[@id='child-age-input-0-0']"));
		 List<WebElement> ageElement = driver.findElements(By.xpath("//select[@id='child-age-input-0-0']"));
		System.out.println(ageElement.size());
		
		
		 //boolean elementDisplayed = hiddenElement.isDisplayed();
		//System.out.println("Element displayed? before clicking on + button "+hiddenElement);
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'uitk-step-input-controls')])[2]//button[2]")).click();
		
		WebElement hiddenElement2 = driver.findElement(By.xpath("//select[@id='child-age-input-0-0']"));
		boolean elementDisplayed = hiddenElement2.isDisplayed();
		
		System.out.println("Element after clicking on the + button displayed? "+elementDisplayed);
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}


	

}
