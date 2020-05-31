package ASeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileuploadPopup7 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		String path = System.getProperty("user.dir");
		
		driver.findElement(By.name("upfile")).sendKeys(path+"/src/main/java/testData/AL C2.png");
		//type=file should be available for file upload 
		
		
		
		
	}

}
