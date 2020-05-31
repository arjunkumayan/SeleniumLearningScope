package ASeleniumSessions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo {
	
	@Test
	public void test1()
	{
		SoftAssert softAssert = new SoftAssert();
			
		String str = "Hello";
		softAssert.assertEquals("Hello", str);
		
		softAssert.assertTrue(false);
		System.out.println("should display this line-----------");
		
		softAssert.assertEquals("Test", "Test");
		
		softAssert.assertAll();
		
		
		
	}
	
	@Test
	public void test2()
	{
		
		System.out.println("Inside test2 method");
		
		
		
	}
	
	

}
