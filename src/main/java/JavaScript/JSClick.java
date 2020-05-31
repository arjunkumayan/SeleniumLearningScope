package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSClick {
	
	
	@Test
	public void doclickByJS() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		
		//driver.findElement(By.id("login-username")).sendKeys("arjunkumayan18@gmail.com");
		Thread.sleep(3000);
		
		
		// driver.findElement(By.id("persistent")).click();  // it is giving error - ElementNotInteractableException
		//The element must be visible and it must have a height and widthgreater then 0.
		/* if the element is not visible in that you can use the javascript which will directly communicate to DOM and perform the actions
		 * 
		 * Note- but you should not always use the javascipt because if suppose the element is hidden and that is defect but 
		 * if you perform using the javascript it will still perform the actions and will drop the defect.
		 */
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement email = driver.findElement(By.id("login-username"));
		WebElement checkBox = driver.findElement(By.id("persistent"));
		
		// Sending value to text field
		js.executeScript("arguments[0].value='arjunkumaya@gmail.com'", email);
		
		// clicking the element using the javascript
		js.executeScript("arguments[0].click()",checkBox);
		
		Thread.sleep(3000);
		
		driver.quit();
		
		// org.openqa.selenium.ElementNotInteractableException: element not interactable
	}

}
