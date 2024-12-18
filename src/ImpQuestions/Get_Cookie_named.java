package ImpQuestions;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Cookie_named {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		Cookie cur = driver.manage().getCookieNamed("currency");
		System.out.println(cur);
		
		
	}

}
