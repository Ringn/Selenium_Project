package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_Priority 
{
// to change the order of execution we need to use 
	//testng keyword "priority"
	
	@Test(priority=2)
	public void tc1() 
	{
		Reporter.log("running test case 1",true);
	}
	
	@Test(priority=1)
	public void tc2() 
	{
		Reporter.log("running test case 2",true);
	}
	
	
	//if we not use priority compiler will execute methods
	//alphabetically
	
	
}

