package NJuly2019SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public static WebDriver driver;
	
	static By email = By.id("username");
	static By password = By.xpath("//*[@id='password']");
	static By loginButton = By.cssSelector("#loginBtn");
	static By signUpLink = By.linkText("Sign up");
	

	public static void main(String[] args) throws InterruptedException {

		driver = Util.launchBrowser(driver, "chrome");
		Util.launchUrl(driver, "https://app.hubspot.com/login");
		Thread.sleep(5000);
		System.out.println(Util.getPageTitle(driver));
		
		Util.getElement(driver, email,10).sendKeys("test@gmail.com");
		Util.getElement(driver, password,1).sendKeys("test@123");
		Util.getElement(driver, loginButton,1).click();
		Util.getElement(driver, signUpLink,1).click();


		
		
	}

}
