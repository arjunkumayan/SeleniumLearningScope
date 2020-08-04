package SeleniumHierarchy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentWaysOfSendingCharacter {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/");
		
		Thread.sleep(10000);
		WebElement username= driver.findElement(By.id("username"));
		WebElement password= driver.findElement(By.id("password"));
	//1. String	
		String str = "pasword";
	
		//2. StringBuilder
		StringBuilder builder = new StringBuilder();
		builder.append("Arjun")
		        .append(" ")
		        .append("singh");
		username.sendKeys(builder);
		password.sendKeys(str);
		
	Boolean enabled = 	driver.findElement(By.id("loginBtn")).isEnabled();
	System.out.println("Enabled= "+enabled);
	Boolean displayed = 	driver.findElement(By.id("loginBtn")).isDisplayed();
	System.out.println("displayed = "+displayed);
	Boolean selected = 	driver.findElement(By.id("loginBtn")).isSelected();
	System.out.println("selected = "+selected);
	
	
	//3. StringBuffer
	
	StringBuffer buffer = new StringBuffer();
	buffer.append("arjun").append("Test").append("Labs");
	
	username.sendKeys(buffer);
	String space= " ";
	String author ="arjun";
	
	username.sendKeys(str,buffer,builder,space,author,Keys.TAB);
	
	
	}

}
