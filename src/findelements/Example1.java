package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1 {
	
	@Test
	public void tc1() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		for(WebElement s1:links)
		{
			System.out.println(s1.getText());
		}
		
	}

}
