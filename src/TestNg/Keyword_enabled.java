package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_enabled 
{
	//enabled use to comment a perticular test method
	
	@Test(enabled=false)
	public void tc1() 
	{
		Reporter.log("running test case 1",true);
	}
	
	@Test
	public void tc2() 
	{
		Reporter.log("running test case 2",true);
	}
	
	
}

