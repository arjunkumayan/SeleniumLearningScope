package SeleniumHierarchy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureTotalLinksText {
	WebDriver driver;
	
	By totalLinksPath = By.xpath("//input[@type='text']");
	By checkBox = By.id("div_hintQS");
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php");
		
	}
	
	@Test
	public void doEnterText() {
		WebElement checkBoxElement = driver.findElement(checkBox);
		String styleAttribute = checkBoxElement.getAttribute("style");
		if(styleAttribute.contains("hidden")) {
			System.out.println("Checkbox is not checked");
			
		}
		WebElement selectDropdown = null;
		WebElement check1= driver.findElement(By.xpath("//input[@type='checkbox']"));
		if(!check1.isSelected()) {
			check1.click();
			selectDropdown = driver.findElement(By.xpath("//td[text()='Select a Security Question']/parent::tr//select"));
			Select select = new Select(selectDropdown);
			List<WebElement> listOptions = select.getOptions();
			listOptions.forEach(values ->{
				System.out.println(values);
			});
			select.selectByVisibleText("What is your favourite food?");
		}
		if(selectDropdown.getText().equals("What is your favourite food?")) {
			System.out.println("Element selected is good");
		}
		
	}
	
	@AfterClass
	public void tearDown() {
	//	driver.quit();
	}

}
