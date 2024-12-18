package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Failed_Xml {
	
	@Test
	public void m1() 
	{
		Reporter.log("running m1",true);
	}
	
	@Test
	public void m2() 
	{
		Reporter.log("running m2",true)
	}
	
	@Test
	public void m3() 
	{
		Reporter.log("running m3",true);
	}

}

