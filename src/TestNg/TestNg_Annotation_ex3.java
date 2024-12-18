package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Annotation_ex3 {

	@BeforeClass// code runs only once before all the methods of class
	public void login() 
	{
		System.out.println("enter username pw and login");
		
	}
	
	@BeforeMethod
	public void home1() 
	{
		System.out.println("perform actions on home1 page");
	}
	
	@Test
	public void home2() 
	{
		System.out.println("perform actions on home2 page");
	}
	
	@AfterClass
	public void logout() 
	{
		System.out.println("logout");
	}
	
	
}

