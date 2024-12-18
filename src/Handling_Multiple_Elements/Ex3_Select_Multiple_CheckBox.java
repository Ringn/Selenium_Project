package Handling_Multiple_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_Select_Multiple_CheckBox {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Pratiksha/Desktop/multipleclcheckbox.html");
		List<WebElement> all_box = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement b:all_box)
		{
			b.click();
		}
		
	}

}

