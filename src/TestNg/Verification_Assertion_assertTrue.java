package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification_Assertion_assertTrue
{
	@Test
	public void m1_asserTrue() 
	{
		boolean Act=true;
		Assert.assertTrue(Act,"failed: both are same");
		
		//if we pass Act=false then it will fail the verification 
				//because we are using assertTrue method	
		
		String actresult="abcd";
		String expected="xyz";
		
		Assert.assertEquals(actresult, expected,"failed:=both are different");
		
	}
	@Test
	public void name() 
	{
		System.out.println("hiii");
		
	}
	
	@Test(enabled=false)
	public void name1() 
	{
		System.out.println("hello");
	}
	

}


