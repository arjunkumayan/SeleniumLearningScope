package testNgSessions;

import org.testng.annotations.Test;

public class EnableTest {

	@Test
	public void dtest1()
	{
	System.out.println("dtest1");	
	}
	
	@Test
	public void dtest2()
	{
		System.out.println("dtest2");
	}
	
	@Test(enabled=true)
	public void dtest3()
	{
		System.out.println("dtest3");
	}
	
	@Test(enabled=false)
	public void dtest4()
	{
		System.out.println("dtest4");
	}
}
