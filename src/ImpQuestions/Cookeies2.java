package ImpQuestions;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookeies2 {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/");
		driver.get("https://tutorialsninja.com/demo/");
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("before delete any cookie");
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie);
		}
		
		System.out.println(driver.manage().getCookies().size());
		//delete specific cookies
		driver.manage().deleteCookieNamed("currency");
		
		System.out.println("after deleting cookie");
		Set<Cookie> cookies1 = driver.manage().getCookies();
		for(Cookie cookie:cookies1)
		{
			System.out.println(cookie);
		}
		driver.quit();
		
	}

}
