package ASeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigate3 {

	public static void main(String[] args) {
	
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.amazon.in");
		//System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.in");
        System.out.println(driver.getTitle());

		
		// diff between Get and Navigate().to("")
		// driver.get() - it will wait till the page is fully loaded
		// driver.navigate().to("")- it will not wait for the page to fully loaded
        
        
		
	}

}
