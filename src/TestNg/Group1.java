package TestNg;

import org.testng.annotations.Test;

public class Group1 {
	
	@Test(groups= {"login"})
	public void tc1() 
	{
		System.out.println("tc1 running");
	}
	
	@Test(groups= {"login"})
	public void tc2() 
	{
		System.out.println("tc2 running");
	}
	
	@Test(groups= {"payment"})
	public void tc3() 
	{
		System.out.println("tc3 running");
	}

}
