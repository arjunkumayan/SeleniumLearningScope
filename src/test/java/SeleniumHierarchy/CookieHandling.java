package SeleniumHierarchy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookieHandling {

	public static void main(String[] args) {


		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	
		driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
		
		driver.findElement(By.name("username")).sendKeys("arjun");
		driver.findElement(By.name("password")).sendKeys("1234");
		
		driver.findElement(By.cssSelector("button[name='submit'")).click();
		
		
		File file = new File("./target/files/cookes.data");
	     
		
		FileWriter fileWriter;
		try {
			file.delete();
			file.createNewFile();
			fileWriter = new FileWriter(file);
			BufferedWriter bWrite = new BufferedWriter(fileWriter);
			Set<Cookie> cookie = driver.manage().getCookies();
			for(Cookie c:cookie) {
				bWrite.write((c.getName()+";"+c.getValue()+";"+c.getDomain()+";"+c.getPath()+";"+c.getPath()+";"+c.getExpiry()+";"+c.isSecure()+";"+c.isHttpOnly()));
				bWrite.newLine();
				
			}
			bWrite.close();
			fileWriter.close();		
		
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
