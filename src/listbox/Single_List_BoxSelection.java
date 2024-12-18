package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_List_BoxSelection {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		 
		 Select  s=new Select(month);
		// s.selectByIndex(5);
		 s.selectByVisibleText("Nov");
		 //s.selectByValue("8");
		 
		 
	}

}
