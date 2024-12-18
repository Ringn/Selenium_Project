package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_TimeOut 
{
	//if test class contains multiple test methods 
	//and one of the test method is time consuming
	//then TestNg bydefault fail that TC & executes the 
	//other TC
	
	@Test(timeOut=5000)
	public void tc1() throws InterruptedException 
	{
		Thread.sleep(8000);
		Reporter.log("running test case 1",true);
	}
	
	@Test
	public void tc2() 
	{
		Reporter.log("running test case 2",true);
	}
	
	
}


