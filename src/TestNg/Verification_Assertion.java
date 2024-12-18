package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification_Assertion 
{
	@Test
	public void m1_asserEquals() 
	{
		String expText="abcd";
		String actText="xyz";
		
		Assert.assertEquals(expText,actText,"failed: both are different");
		
		
		//if 
	}
	

}
