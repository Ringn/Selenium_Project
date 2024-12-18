package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;
//@Test use when we want to run script without main method
//we cant use main method and Test both
public class ex2_TestCase {
	//when you want the output in both console and 
	//and the emailable report then use
	@Test
	public void tc1() 
	{
		//System.out.println("==pass testcase2==");
		//when you only want output in emailable report
		Reporter.log("==pass test case1==");
		
	}
	@Test
	public void tc2() 
	{
		//System.out.println("===pass tc2==");
		Reporter.log("tc2",true);
		//both console and report 
		//Reporter.log("tc2",false);
		//only in report
	}
	
	

}
