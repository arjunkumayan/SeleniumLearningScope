package SeleniumHierarchy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Set;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookieGetHandling {

	public static void main(String[] args) {


		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	
		//driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
		
		//driver.findElement(By.name("username")).sendKeys("arjun");
		//driver.findElement(By.name("password")).sendKeys("1234");
		
		//driver.findElement(By.cssSelector("button[name='submit'")).click();
		
		
		
		
	     
		
		FileWriter fileWriter;
		try {
			File file = new File("./target/files/cookes.data");
			FileReader fileReader = new FileReader(file);
			BufferedReader buffered = new BufferedReader(fileReader);
			
			String strLine = null;
			while(buffered.readLine()!=null){
				
				StringTokenizer token = new StringTokenizer(strLine,";");
			
			while(token.hasMoreElements()) {
				String name = token.nextToken();
				String value = token.nextToken();
				String domain = token.nextToken();
				String path = token.nextToken();
				Date expiry = null;
				String val;
				if(!(val=token.nextToken()).equals(null)){
					expiry = new Date();
				}
			
			
			Boolean isSecure = new Boolean(token.nextToken()).booleanValue();
				
			Cookie ck= new Cookie(name, value, domain, path, expiry, isSecure);
			System.out.println(ck);
			driver.manage().addCookie(ck);
			}
			}
								
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
			
		
	
		
		
		
		
		
	}

}
