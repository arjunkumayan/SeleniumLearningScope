package NJuly2019SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAllTheLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));

		System.out.println("total links: " + linksList.size());

		for (int i = 1; i < linksList.size(); i++) {
			String text = linksList.get(i).getText();
			System.out.println(text);
			if (!text.isEmpty()) {
				linksList.get(i).click();
				driver.navigate().back();
			}
			linksList = driver.findElements(By.tagName("a"));
		}
	}

}
