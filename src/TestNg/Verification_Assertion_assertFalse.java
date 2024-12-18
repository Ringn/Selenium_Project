package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification_Assertion_assertFalse
{
	@Test
	public void m1_asserFalse() 
	{
		boolean Act=false;
		Assert.assertFalse(Act,"failed: both are same");
		
		//if we pass Act=true then it will fail the verification 
		//because we are using assertfalse method
		
	}
	

}



