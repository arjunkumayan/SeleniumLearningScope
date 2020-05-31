package N2020SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLogin {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ElementUtil elementUtil = new ElementUtil(driver);

		By emailID = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		By signUp = By.linkText("Sign up");

		driver.get("https://app.hubspot.com/login");

		// elementUtil.clickWhenReady(signUp, 6);

		String title = elementUtil.waitForTitleToBePresent("Login", 6);
		System.out.println(title);

		elementUtil.waitForElementToBePresent(emailID, 15).sendKeys("naveen@gmail.com");
		elementUtil.doSendKeys(password, "TEst@1234");

		// elementUtil.doClick(loginButton);
		elementUtil.waitForElementToBePresent(loginButton, 5).click();
		//

	}

}
