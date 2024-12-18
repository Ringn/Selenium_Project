package TestNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Annotation {

	@BeforeTest//code runs before each test method
	public void login() 
	{
		System.out.println("enter username pw and login");
		
	}
	@Test
	public void home1() 
	{
		System.out.println("perform actions on home page");
	}
	
	@Test
	public void home2() 
	{
		System.out.println("perform actions on home2 page");
	}
	
	
	@AfterTest
	public void logout() 
	{
		System.out.println("logout");
	}
	
	//first before test executed then test(home1)&test(home2) and then after test
}
