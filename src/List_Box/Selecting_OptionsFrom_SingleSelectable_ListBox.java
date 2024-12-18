package List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_OptionsFrom_SingleSelectable_ListBox 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//Step1:find the listbox element and store in a variable
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	    
		//step2:create the object of select class and pass the element
		
		Select s1=new Select(month);
	
		s1.selectByVisibleText("Jan");
		//s1.selectByIndex(2);
		//s1.selectByValue(value);
		
		
	}
	

}
