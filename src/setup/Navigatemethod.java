package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethod {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");//navigate method use to
			//open a url in chrome same as get method we can call it alternagte method of get method
		
		    Thread.sleep(5000);
			driver.navigate().to("https://web.whatsapp.com/");
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(5000);
			driver.navigate().forward();
			Thread.sleep(5000);
			driver.navigate().refresh();
		
	}

}
