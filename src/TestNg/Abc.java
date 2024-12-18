package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Abc
{
    @Parameters("Broser")
	@Test
	public void name(String Broser) 
	{
		
		WebDriver driver=null;
		if(Broser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		

		else if(Broser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		

		if(Broser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7744838574");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Ringne");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}
	
}
