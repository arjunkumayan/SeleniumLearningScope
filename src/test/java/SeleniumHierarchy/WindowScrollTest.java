package SeleniumHierarchy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowScrollTest {
	
	@Test
	public void getPageText() {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://register.rediff.com/register/register.php");
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//*[contains(text(),'By clicking on')]")));
		
		String te = driver.findElement(By.xpath("//*[contains(text(),'By clicking on')]")).getText();
		System.out.println(te);
		//*[contains(text(),'By clicking on')]
	}

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://register.rediff.com/register/register.php");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("//a[text()='privacy policy']")));
		
	WebElement element = driver.findElement(By.xpath("//a[text()='privacy policy']"));
		
	System.out.println(element.getText());
	}
	

}
