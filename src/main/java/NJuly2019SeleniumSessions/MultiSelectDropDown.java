package NJuly2019SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();

		Thread.sleep(3000);
		// selectMultipleValues(driver, "choice 1","choice 6 2 1", "choice 2 1");
		 selectMultipleValues(driver, "choice 2");

		//selectMultipleValues(driver, "ALL");

	}

	public static void selectMultipleValues(WebDriver driver, String... value) {
		List<WebElement> dropList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		System.out.println(dropList.size());

		if (!value[0].equalsIgnoreCase("ALL")) {
			for (int i = 0; i < dropList.size(); i++) {
				String text = dropList.get(i).getText();
				System.out.println(text);

				for (int j = 0; j < value.length; j++) {
					try {
						if (!text.isEmpty()) {
							if (text.equals(value[j])) {
								dropList.get(i).click();
								break;
							}
						}
					} catch (Exception e) {

					}
				}
			}
		} else {
			try {
				for (int full = 0; full < dropList.size(); full++) {
					dropList.get(full).click();
				}
			} catch (Exception e) {

			}
		}

	}

}
