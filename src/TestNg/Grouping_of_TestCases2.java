package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_of_TestCases2 {
	
	@Test(groups= {"Login"})
	public void m7() 
	{
		Reporter.log("running m7",true);
	}
	
	@Test(groups= {"Login"})
	public void m8() 
	{
		Reporter.log("running m8",true);
	}
	
	@Test(groups= {"Payment"})
	public void m9() 
	{
		Reporter.log("running m9",true);
	}
	
	@Test(groups= {"Payment"})
	public void m10() 
	{
		Reporter.log("running m10",true);
	}
	
	@Test(groups= {"Profile"})
	public void m11() 
	{
		Reporter.log("running m11",true);
	}

}


