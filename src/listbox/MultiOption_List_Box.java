package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiOption_List_Box {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Pratiksha/Desktop/dropdown.html");
		Thread.sleep(2000);
		WebElement car = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s1=new Select(car);
		s1.selectByIndex(1);
		s1.selectByValue("saab");
		s1.selectByVisibleText("Swedish Cars");
		System.out.println(s1.isMultiple());//facebook we cant select multiple optiond
		
		
		
		
	}

}
