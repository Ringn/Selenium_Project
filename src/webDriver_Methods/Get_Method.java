package webDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Method {
	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
	}

}
