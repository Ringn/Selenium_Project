package POM_DDF_TestNg_2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsBaseClass 
{
	WebDriver driver;
	
	public void OpenBrowser() 
	{
	    driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
