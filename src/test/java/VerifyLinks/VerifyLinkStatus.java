package VerifyLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLinkStatus {
	
	public static int validLinksCount=0;
	public static int invalidLinksCount=0;
	public static void verifyActiveLinks(String linkUrl) {
		
		
		try {
			URL url = new URL(linkUrl);
			
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection.setConnectTimeout(3000);
			httpURLConnection.connect();
			
			if(httpURLConnection.getResponseCode()==200) {
				++validLinksCount;
				   System.out.println("Valid count of links are: "+validLinksCount);
				System.out.println(linkUrl+ " - "+httpURLConnection.getResponseMessage());
			}
			if(httpURLConnection.getResponseCode() ==  httpURLConnection.HTTP_NOT_FOUND) {
				++invalidLinksCount;
				 System.out.println("InValid count of links are: "+invalidLinksCount);
				System.out.println(linkUrl+ " - "+httpURLConnection.getResponseMessage()+" -"+httpURLConnection.HTTP_NOT_FOUND);
			}
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.google.com");
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		
        System.out.println("Total links are: "+links.size());
        
        for(int i=0; i<links.size() ; i++) {
        	
        	WebElement  linkGoogle = links.get(i);
        	String url=linkGoogle.getText();
        	//System.out.println(url);
        	String linksName = linkGoogle.getAttribute("href");
        	System.out.println(linksName);
        	verifyActiveLinks(linksName);
        }
        
        System.out.println("Valid count of links are: "+validLinksCount);
        System.out.println("InValid count of links are: "+invalidLinksCount);
        
	}

}
