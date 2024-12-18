package ImpQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selecter {
	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//locate using tag#id or *#id or #id
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("ashvaghosh");
		
		driver.findElement(By.cssSelector("*#pass")).sendKeys("12324");
		
		driver.findElement(By.cssSelector("#email"));//username also

		

		
	}

}
