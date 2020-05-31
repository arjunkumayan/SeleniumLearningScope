package ASeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AngularApptest {
	
	@Test
	public void test01() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://juliemr.github.io/protractor-demo/");
		
		By firstName= By.xpath("//input[@ng-model='first']");
		By secondName= By.xpath("//input[@ng-model='second']");
		By goButton= By.xpath("//button[text()='Go!']	");
		By text= By.xpath("//h2[@class='ng-binding']");
		
		//input[@ng-model='first']
		//input[@ng-model='second']
		//button[text()='Go!']	
		//h2[@class='ng-binding']
		
		driver.findElement(firstName).sendKeys("2");
		driver.findElement(secondName).sendKeys("3");
		
		driver.findElement(goButton).click();
		String text1 = driver.findElement(text).getText();
		Thread.sleep(3000);
		
		Assert.assertEquals(text1, "5");
	}

}
