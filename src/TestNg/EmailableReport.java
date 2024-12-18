package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EmailableReport 
{
	//using emailable report we can easily identify or understand
	//how how many test case pass,fail or skipp
	//we can maintain emilable report as test proof
	//steps to generate emailable report
	//1)create test class
	//2)execute it & refresh the project
	//3)then in the test output folder emailable report will generate
	
	@Test
	public void Tc1() 
	{
		Reporter.log("tc1 running");	
	}
	
	@Test
	public void Tc2() 
	{
		Reporter.log("tc2 running");	
	}
	
	@Test
	public void Tc3() 
	{
		Reporter.log("tc3 running");	
	}

}
