package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Start_Maximized {
	public static void main(String[] args) throws InterruptedException
	{
		//create object of chromeoptions class
		ChromeOptions options=new ChromeOptions();
		
		//add arguments for incognito mode
		options.addArguments("start-maximized");
		
		//pass the chromeoptions object in chromeDriver constructor
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}

}
