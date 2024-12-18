package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification_Assertion_assertNotEqual 
{
	@Test
	public void m1_asserNotEquals() 
	{
		String expText="abcd";
		String actText="abcd";
		
		Assert.assertNotEquals(expText,actText,"failed: both are same");
		
		
		//if 
	}
	

}

