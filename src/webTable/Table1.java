package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Pratiksha/Desktop/table.html");
		
		
		List<WebElement> allrow = driver.findElements(By.xpath("//table//tr"));
		
		System.out.println(allrow.size());
		
		for(int i=1;i<=2;i++)
		{
			for(int j=1;j<=3;j++)
			{
			String text = driver.findElement(By.xpath("//table//tr["+i+"]//td["+j+"]")).getText();
			System.out.print(text+" ");
			}
			System.out.println();
		}
	}

}
