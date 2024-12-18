package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/ ");
		driver.findElement(By.xpath("//button[@value='1']")).click();
		//click is a method of webelement
		//use to  click the elements of broweser
	}

}

