package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_of_TestCases {
	
	@Test(groups= {"Login"})
	public void m1() 
	{
		Reporter.log("running m1",true);
	}
	
	@Test(groups= {"Login"})
	public void m2() 
	{
		Reporter.log("running m2",true);
	}
	
	@Test(groups= {"Payment"})
	public void m3() 
	{
		Reporter.log("running m3",true);
	}
	
	@Test(groups= {"Payment"})
	public void m5() 
	{
		Reporter.log("running m4",true);
	}
	
	@Test(groups= {"Profile"})
	public void m6() 
	{
		Reporter.log("running m4",true);
	}

}

