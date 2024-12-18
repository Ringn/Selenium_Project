package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

import graphql.Assert;

public class Failed_Xml2 {
	
	@Test
	public void m4() 
	{
		Reporter.log("running m4",true);
	}
	
	@Test
	public void m5() 
	{
		Reporter.log("running m5",true)
	}
	
	@Test
	public void m6() 
	{
		boolean b=false;
		Assert.assertTrue(b,"actual result is false");
	}

}

