package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubspotTest {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();


driver.get("https://app.hubspot.com/");
Thread.sleep(5000);

String text = driver.findElement(By.xpath("//small[@id='password-description']//*[text()='Forgot my password']")).getText();
System.out.println(text);
	}

}
