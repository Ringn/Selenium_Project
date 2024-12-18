package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords2 
{
	@Test(invocationTimeOut=5000)
	public void tc1() throws InterruptedException 
	{
		Thread.sleep(8000);
		Reporter.log("TC1 running");
		
	}
	
	@Test(invocationCount=2)
	public void tc2() 
	{
		
		Reporter.log("TC2 running");
		
	}
	
	@Test(enabled=false)
	public void tc3() 
	{
		
		Reporter.log("TC3 running");
		
	}
	
	@Test
	public void tc5() 
	{
		
		Reporter.log("TC4 running");
		
	}
	
	

}
