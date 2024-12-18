package List_Box;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelected_OptionFrom_MultiSelectable_ListBox 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Pratiksha/Desktop/list.html");
		
		
		//Step1:find the listbox element and store in a variable
		WebElement month = driver.findElement(By.xpath("//select[@id='item-dropdown']"));
	    
		//step2:create the object of select class and pass the element
		
		Select s1=new Select(month);
		
		s1.selectByVisibleText("Item 1");
		s1.selectByVisibleText("Item 2");
		s1.selectByVisibleText("Item 3");
	    List<WebElement> options = s1.getOptions();
	    for(WebElement item:options) 
	    {
	    	System.out.println(item.getText());
	    
	    }
	    
	    
	    List<WebElement> allop = s1.getAllSelectedOptions();
	    for(WebElement item:allop)
	    {
	    	System.out.println(item.getText());
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    s1.deselectAll();
		
	}
	

}

