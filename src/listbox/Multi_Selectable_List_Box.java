package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Selectable_List_Box {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Pratiksha/Desktop/list.html");
		
		 WebElement team = driver.findElement(By.xpath("//select[@id='item-dropdown']"));
		 
		 Select s=new Select(team);
		 
		 s.selectByVisibleText("Item 3");
		 s.selectByVisibleText("Item 2");
		
		//select item 3 and 2 at a time
		
	}

}
