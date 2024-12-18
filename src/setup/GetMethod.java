package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://web.whatsapp.com/");//used for opening the specific app;
		Thread.sleep(5000);//used for wating mili seconds
		String title=driver.getTitle();//for geting title and storing into variable
		System.out.println(title);
		driver.close();//used to close curent tab
		//driver.quite();//used to close all tabs
		
	}

}
