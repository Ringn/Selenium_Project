package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Is_Multiple {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Pratiksha/Desktop/list.html");
		
		WebElement item = driver.findElement(By.xpath("//select[@id='item-dropdown']"));
		
		Select s=new Select(item);
		
		//System.out.println(s.isMultiple());
	boolean	b=s.isMultiple();
	if(b)
	{
		System.out.println("is multiple");
	}
	else
	{
		System.out.println("is not multiple");
	}
		
	}

}
