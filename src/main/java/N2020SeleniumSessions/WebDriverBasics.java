package N2020SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//on windows:
		//c:\\drivers\\chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver_80");
		
		WebDriver driver = new ChromeDriver(); //launch chrome
		//driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.google.com"); //launch url
		
		String title = driver.getTitle();//get the page title
		System.out.println("page title is : " + title);
		
		//validation point: actual vs expected result:
		if(title.equals("Google")){
			System.out.println("correct title");
		}
		else{
			System.out.println("in correct title");
		}
		
		System.out.println(driver.getCurrentUrl());
		String url = driver.getCurrentUrl();
		
		if(url.contains("google")){
			System.out.println("correct url");
		}else{
			System.out.println("incorrect url");
		}
		
		//System.out.println(driver.getPageSource());
		
		//quit the browser:
		driver.quit();
		
	}

}
