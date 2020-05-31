package ASeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksVerificationTest {
	
	public static void verifyLinks(String linkURL) {
		
		try {
			URL url = new URL(linkURL);
			
			HttpURLConnection httpUrlConnection = (HttpURLConnection)url.openConnection();
			
			httpUrlConnection.setConnectTimeout(3000);
			httpUrlConnection.connect();
			
			if(httpUrlConnection.getResponseCode()==200) {
				
				System.out.println(linkURL+ "--- is valid "+httpUrlConnection.getResponseMessage());
			}
			else if(httpUrlConnection.getResponseCode()== httpUrlConnection.HTTP_NOT_FOUND ) {
				System.out.println(linkURL+ "--- is Invalid "+httpUrlConnection.getResponseMessage());
				
			}
			else if(httpUrlConnection.getResponseCode()== httpUrlConnection.HTTP_BAD_REQUEST) {
				System.out.println(linkURL+ "--- is Invalid "+httpUrlConnection.getResponseMessage());
				
			}
			
		} catch (MalformedURLException e) {
			System.out.println("Some exception occured while creating the connection");
			
		} catch (IOException e) {
		
			System.out.println("Some exception occure while connecting");
		}
		
	}
	
	
	@Test
	public static void verifyBrokenLinsTest() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
       List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		int totalLinks = linkList.size();
		System.out.println("total links on the page "+ totalLinks);
		
		for(int i=0; i<totalLinks; i++){
			String linkText = linkList.get(i).getText();
			
			if(! linkText.isEmpty()){
				System.out.print(i+"--->"+linkText + " --->");
				//System.out.println(linkList.get(i).getAttribute("href"));
				
			    String linkURL = linkList.get(i).getAttribute("href");
			    verifyLinks(linkURL);
				
			}
		}
		
		
	}

}
