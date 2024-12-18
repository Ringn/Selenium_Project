package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_First_Selected_From_Multi_Selectable {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Pratiksha/Desktop/list.html");
		
		 WebElement team = driver.findElement(By.xpath("//select[@id='item-dropdown']"));
		 
		 Select s=new Select(team);
		 
		 s.selectByVisibleText("Item 1");
		 s.selectByVisibleText("Item 2");
		 Thread.sleep(2000);
		 
		System.out.println( s.getFirstSelectedOption().getText());
		
	}

}
