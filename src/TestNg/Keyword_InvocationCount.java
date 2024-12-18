package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_InvocationCount 
{
	//invocation count use to run a perticular test case multiple times
	
	@Test(invocationCount=5)
	public void tc1() 
	{
		Reporter.log("running test case 1",true);
	}
	
	
}

