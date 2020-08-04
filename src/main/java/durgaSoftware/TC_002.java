package durgaSoftware;

public class TC_002 extends BaseTest {

	public static void main(String[] args) {
		
		launch("firefox");
		navigateUrl("https://login.yahoo.com/");
		System.out.println(driver.getTitle());

	}

}
