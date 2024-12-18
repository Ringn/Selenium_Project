package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);//WE CAN USE WINDOW OR TAB
		driver.get("https://web.whatsapp.com/");
		
	}

}
