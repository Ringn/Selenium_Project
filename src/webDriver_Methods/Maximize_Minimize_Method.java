package webDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_Minimize_Method {
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		driver.manage().window().minimize();
		Thread.sleep(2000);
		System.out.println(url);
		
		driver.close();
		
	}

}

