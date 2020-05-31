package NJuly2019SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelect {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(3000);
		// selectValues(driver, "choice 1", "choice 3", "choice 2 1");
		// selectValues(driver, "All");
		selectValues(driver, "choice 6 2 1", "choice 6 2 2", "choice 6 2 3");

	}

	public static void selectValues(WebDriver driver, String... arg) {

		int count = 0;
		List<WebElement> daysList = driver.findElements(
				By.xpath("//div[@class='comboTreeDropDownContainer']/ul" + "//li/span[@class='comboTreeItemTitle']"));

		if (!arg[0].equalsIgnoreCase("ALL")) {
			System.out.println(daysList.size());

			for (int i = 0; i < daysList.size(); i++) {
				System.out.println(daysList.get(i).getText());
				String text = daysList.get(i).getText();

				for (int j = 0; j < arg.length; j++) {
					if (text.equals(arg[j])) {
						daysList.get(i).click();
						count = count + 1;
					}
				}

				if (count == arg.length) {
					break;
				}

			}
		}

		// all
		else {
			try {
				for (int all = 0; all < daysList.size(); all++) {
					daysList.get(all).click();
				}
			} catch (Exception e) {

			}
		}

	}

}
