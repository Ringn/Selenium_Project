package ImpQuestions;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_cookies {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		
		Cookie c=new Cookie("abc","101");
		driver.manage().addCookie(c);
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		
		for(Cookie s1:cookies)
		{
			System.out.println(s1);
		}
	}

}
