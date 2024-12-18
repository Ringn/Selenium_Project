package TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verification_Assertion_SoftAssertion
{
	//step1:create the object of softassert class
	
	
	
	
	@Test
	public void m1_() 
	{
		SoftAssert soft= new SoftAssert();
		boolean ActResult=false;
		soft.assertTrue(ActResult,"failed1: actual result false");
		
		String actual="xyz";
		String expected="abcd";
		
		soft.assertEquals(actual, expected,"failed2: both results are different");
		
		soft.assertAll();
	}
	
	

}


