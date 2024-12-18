package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColumnSize {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Pratiksha/Desktop/table.html");
		
		List<WebElement> Colsize = driver.findElements(By.xpath("//table//tr[1]//td"));
		
		System.out.println(Colsize.size());
		
	}

}

