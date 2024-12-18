package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;


public class Minimizemethos {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver  driver = new ChromeDriver();
		//here we are created object of chrome driver class
		//and give the return to the webdriver class
		//1)here we  use webdriver instaed of chromedriver because our version of selenium is webdriver
		//2)we have performed upcasting here
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String expecttitle="Facebook – log in or sign up";
		if(title.equals(expecttitle))
		{
			System.out.println("navigate to correct web page");
			
		}
		else
		{
			System.out.println("navigate to wrong webpage");
		}
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		//manage is a method of interface taht returns object of Options class
		//in option class we have window method that returns object of Window class
		//in Window class we have methods like minimize maximaze,refresh
		Options s1=driver.manage();
		Window s2=s1.window();
		s2.maximize();
		
	}

}
