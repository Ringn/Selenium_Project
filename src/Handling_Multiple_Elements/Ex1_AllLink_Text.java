package Handling_Multiple_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_AllLink_Text {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		List<WebElement> all_link = driver.findElements(By.xpath("//a"));
		for(WebElement l:all_link)
		{
			System.out.println(l.getText());
		}
		
	}

}
