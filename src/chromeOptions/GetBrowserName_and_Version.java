package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetBrowserName_and_Version {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		
		System.out.println(driver.getCapabilities().getBrowserName());
		System.out.println(driver.getCapabilities().getBrowserVersion());

		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}

}

