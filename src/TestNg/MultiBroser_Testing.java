package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBroser_Testing {
	

	@Parameters("browserName")
	@Test
	public void verifylogin(String browserName) 
	{
		WebDriver driver=null;
		if(browserName.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		

		else if(browserName.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		

		if(browserName.equals("firefox"))
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
