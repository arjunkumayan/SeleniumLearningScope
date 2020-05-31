package NJuly2019SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));

		System.out.println("total links: " + linksList.size());

		for (int i = 0; i < linksList.size(); i++) {
			String text = linksList.get(i).getText();
			System.out.println(text);
			if (text.equals("Forgot Password?")) {
				linksList.get(i).click();
				break;
			}
		}

	}

}
