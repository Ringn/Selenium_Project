package webDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Quite_Method {
	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
	    driver.close();
        
	   // driver.quit();
		
	}

}


