package TestNg;

import org.testng.annotations.Test;

public class Group2 {
	
	@Test(groups= {"login"})
	public void tc4() 
	{
		System.out.println("tc4 running");
	}
	
	@Test(groups= {"login"})
	public void tc5() 
	{
		System.out.println("tc5 running");
	}
	
	@Test(groups= {"payment"})
	public void tc6() 
	{
		System.out.println("tc6 running");
	}

}

