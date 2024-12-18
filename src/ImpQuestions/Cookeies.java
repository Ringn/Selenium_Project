package ImpQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookeies {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().deleteAllCookies();
		
		System.out.println(driver.manage().getCookies().size());
		driver.quit();
		
	}

}
