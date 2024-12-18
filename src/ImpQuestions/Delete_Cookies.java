package ImpQuestions;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_Cookies {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		System.out.println("Before Delete");
		Set<Cookie> cookies = driver.manage().getCookies();
		for(Cookie s1:cookies)
		{
			System.out.println(s1);
		}
		
		ArrayList<Cookie> a1=new ArrayList(cookies);
		System.out.println();
		driver.manage().deleteCookie(a1.get(0));
		System.out.println("after Delete");
		Set<Cookie> cookies1 = driver.manage().getCookies();
		for(Cookie s1:cookies1)
		{
			System.out.println(s1);
		}
	}

}

