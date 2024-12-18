package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_DependsOnMethods 
{
	//if 1 test case execution depends on multiple test case
	//then we need to use ="DepensOnMethod"
	
	@Test
	public void login() 
	{
	
		Reporter.log("login to application",true);
	}
	
	@Test(dependsOnMethods= {"login"})
	public void logout() 
	{
		Reporter.log("logout from application",true);
	}
	
	//logout method will run only when the login methd runs succesfully
	
}



