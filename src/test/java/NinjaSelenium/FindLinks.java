package NinjaSelenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpConnection;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.classes.SearchPage;
import page.classes.SearchPageFactory;

public class FindLinks {
	
	private static WebDriver driver;
	private static String baseUrl;
		
	
	@BeforeClass
	public static void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		baseUrl ="https://www.amazon.in/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
	}
	
	@Test
	public void testFindLinks() {
		driver.get(baseUrl);
		
		//SearchPage.navigateToFlightsTab(driver);
		List<WebElement> linksList = clickableLinks(driver);
		
		for(WebElement link :linksList) {
			
			String href = link.getAttribute("href");
			
			try {
				System.out.println("URL is: "+ href + " returned " +linkStatus(new URL(href)));
			}
			catch(Exception e){
				
				System.out.println(e.getMessage());
			}
			
		}
		
	}
	
	
	public static List<WebElement> clickableLinks(WebDriver driver) {
		List<WebElement> linksToClick = new ArrayList<>();
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		elements.addAll(linksToClick);
		
		elements.addAll(driver.findElements(By.tagName("img")));
		
		for(WebElement e : elements) {
			if(e.getAttribute("href") !=null) {
				linksToClick.add(e);
			}
		}
			
		return linksToClick;
	}
	
	public static String linkStatus(URL url) {
		
		try {
			
			HttpURLConnection http = (HttpURLConnection) url.openConnection();
			http.connect();
			String responseMessage = http.getResponseMessage();
			http.disconnect();
			
			return responseMessage;
		}
		catch(Exception e) {
			return e.getMessage();
		}
		
	}

}
