package testNgSessions;

import org.testng.annotations.Test;

public class PriorityConcept {
	
	@Test
	public void arjun()
	{
		System.out.println("arjun");
	}
	@Test
	public void ankush()
	{
		System.out.println("ankush");
	}
	
	@Test(priority=1)
	public void aarav()
	{
		System.out.println("aarav");
		
	}


}
