package ImpQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_ClassName {
	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//locate using className tagname.classname or .classname or tagname.c1.c2.c3 or .c1.c2.c3 or tag#id.c1.c2.c3
		
		
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy")).sendKeys("ashvaghosh");
		
		driver.findElement(By.cssSelector(".inputtext._55r1._6luy")).sendKeys("12324");
		
		
		

		
	}

}
