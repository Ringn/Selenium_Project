package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Disable_Notification {
	public static void main(String[] args) throws InterruptedException
	{
		//create object of chromeoptions class
		ChromeOptions options=new ChromeOptions();
		
		//add arguments for incognito mode
		options.addArguments("--disable-notifications");
		
		//pass the chromeoptions object in chromeDriver constructor
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.olx.in/en-in");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}

}
