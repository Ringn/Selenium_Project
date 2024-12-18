package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/ ");
		WebElement e=driver.findElement(By.xpath("//input[@id='email']"));
		
		e.sendKeys("7744838574");
		e.clear();
		//clear is a method of webelement
		//use to clear the value that is passed into the elements of broweser
	}

}
