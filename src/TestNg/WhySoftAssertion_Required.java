package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WhySoftAssertion_Required
{
	@Test
	public void m1_asserEquals() 
	{
		String expText="abcd";
		String actText="abcd";
		
		Assert.assertNotEquals(expText,actText,"failed: both are same");
		
		
		//if first verification fail then it will not go to second verification
		//this is the dis advantage of hard assert thats why we use soft assert.
		
		boolean ActResult=false;
		Assert.assertFalse(ActResult);
	
		
		
	}
	

}

