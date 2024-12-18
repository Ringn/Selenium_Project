package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Facebook {
	
	@Test
	public void tc1() 
	{
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//test step1: 
	    //click on mobile number
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7744838574");
		
		//test step2: 
	    //click on password wrong xpath
		WebElement PW = driver.findElement(By.xpath("//input[@id='pas']"));
		PW.sendKeys("adringne");
		
		//test step3: 
	   //click on login
		driver.findElement(By.xpath("//button[@name='login']")).click();

		
		
		
	}

}
