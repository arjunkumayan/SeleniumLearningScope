package NJuly2019SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();//1. launch chrome
		
		driver.get("http://www.google.com");//2. enter url
		
		String title = driver.getTitle(); //3. get the title
		
		System.out.println(title);
		
		//4. validation point: act vs exp
		if(title.equals("Google")){
			System.out.println("correct title");
		}
		else{
			System.out.println("in correct title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
		//driver.close();//close the browser
		
		//driver.quit();//5. close the browser
		
//		String t1 = driver.getTitle();
//		System.out.println(t1);
		
		/*ChromeDriver: chrome on MAC (40435b605c8653f21d9d0e945d098416)
		W1, w2, w3
		quit();

		ChromeDriver: chrome on MAC (null)

		Driver
		NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?

		===========================

		ChromeDriver: chrome on MAC (e20405566a306f4269886b4b8738d93a)
		W1 w2 w3
		close();

		ChromeDriver: chrome on MAC (e20405566a306f4269886b4b8738d93a)

		Driver

		NoSuchSessionException: invalid session id
		*/
	}

}
