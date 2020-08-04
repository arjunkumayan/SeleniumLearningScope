package SeleniumHierarchy;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	public static void main(String[] args) {
		
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println(rowCount);
	//table[@id='customers']//tr[2]/td[1]
	//table[@id='customers']//tr[2]/td[2]
	//table[@id='customers']//tr[3]/td[2]
		
		int colCount = driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td")).size();
	System.out.println(colCount);
	String beforeXpath = "//table[@id='customers']//tr[";
	String afterXpath = "]/td[1]";
	String afterXpath1 = "]/td[";
	
//	for(int rowNum=2 ; rowNum<=rowCount ; rowNum++) {
//		String actualXpath = beforeXpath+rowNum+afterXpath;
//		//System.out.println(actualXpath);
//		String value = driver.findElement(By.xpath(actualXpath)).getText();
//	   System.out.println(value);
//	}
	
	 ArrayList al= new ArrayList<>();
		 for(int i=2; i<=rowCount; i++) {
			 for(int j=1; j<=colCount;j++) { //
		 
		  String actualXpath = beforeXpath+i+afterXpath1+j+"]"; 
		  String text = driver.findElement(By.xpath(actualXpath)).getText(); //
		
		  System.out.println(text);
		  al.add(text);
		
		 	
	 }
	}
	}}

