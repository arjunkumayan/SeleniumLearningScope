package NinjaSelenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class JunitIntroduction1 {

	WebDriver driver;
	String baseUrl = "https://letskodeit.teachable.com/";

	@BeforeClass
	public static void prequisite() {System.out.println("Executed before Class...");
	}

	@Before
	public void setup() {System.out.println("Executed before every test..");}

	@Test
	public void test1() {System.out.println("executed test1...");
	}

	@After
	public void tearDown() {System.out.println("executed after every test...");

	}

	@AfterClass
	public static void cleanUp() {System.out.println("Executed after class");}
}
