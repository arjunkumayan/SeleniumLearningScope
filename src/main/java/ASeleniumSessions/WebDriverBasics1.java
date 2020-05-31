package ASeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics1 {
	WebDriver driver;

	public static void main(String[] args) {

		// Set the server - .executable file
		String projectPath = System.getProperty("user.dir");
		
		//ff
		//System.setProperty("webdriver.gecko.driver", projectPath+"/src/test/resources/drivers/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//chrome
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //1. open the browser
		//ChromeDriver: chrome on WINDOWS (5db1582f799eb99856ac16b46dd174d6)
		
		// Chrome - ChromeDriver.exe- drivers executables
		// ff - geckodriver.exe - driver executables
		
		// the executable drivers like chromedriver.exe are working as a server to interact with the chrome browser
		
		//driver.get("www.google.com"); // Exception in thread "main" org.openqa.selenium.InvalidArgumentException: invalid argument if not with https:
		
		//driver.get("https://google.com"); // Correct it will work without the www as well
		
		// chromedriver.exe launched is not the real browser is the replica of the chrome browser
		
		
		driver.get("https://www.google.com"); //2. launch the browser
		
		                                            //ChromeDriver: chrome on WINDOWS (5db1582f799eb99856ac16b46dd174d6)
		
		String title = driver.getTitle(); //3. get the title
		System.out.println(title);
		
		 //4. validation point
		if(title.equals("Google"))
		{
			System.out.println("correct title ");
		}
		else
		{
			System.out.println("in-correct title");
		}
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		                                   //ChromeDriver: chrome on WINDOWS (a661f1550d8b41ddb6c8f59af0d01e39)
		                                    //driver.quit(); //ChromeDriver: chrome on WINDOWS (null) - session id becomes null
		System.out.println(driver.getTitle()); // if driver.quit() then Exception in thread "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		                                     // for every request the session id is important so this session id is passed to chromedriver.exe server and then it will give to chrome browser
		                                     // throughout your program the same session id is maintained
		
		
		driver.close();                          // session id becomes invalid not null
		System.out.println(driver.getTitle());  // if driver.close() then Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid session id
		
		
		
		// Difference b/w quit and close
		
		//ChromeDriver: chrome on WINDOWS (a661f1550d8b41ddb6c8f59af0d01e39)
		//ChromeDriver: chrome on WINDOWS (a661f1550d8b41ddb6c8f59af0d01e39)
		
		//after Close
		
		//ChromeDriver: chrome on WINDOWS (a661f1550d8b41ddb6c8f59af0d01e39) - it is expired and it is invalid
		
		
	}

}
