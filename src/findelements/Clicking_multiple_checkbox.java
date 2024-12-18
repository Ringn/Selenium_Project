package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Clicking_multiple_checkbox {
	
	@Test
	public void tc1() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Pratiksha/Desktop/multipleclcheckbox.html");
		
		
		List<WebElement> boxes = driver.findElements(By.xpath("//label"));
		
		for(WebElement s1:boxes)
		{
			s1.click();
		}
		
		for(int i=boxes.size()-1;i>=0;i--)
		{
			boxes.get(i).click();
		}
		
	}

}
