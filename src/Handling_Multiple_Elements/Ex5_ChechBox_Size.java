package Handling_Multiple_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_ChechBox_Size {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Pratiksha/Desktop/multipleclcheckbox.html");
		//List<WebElement> all_link = driver.findElements(By.xpath("//a"));
		//int s1 = all_link.size();
		//System.out.println(s1);
		
		//int s1 = driver.findElements(By.xpath("//a")).size();
		//System.out.println(s1);
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
	}

}
