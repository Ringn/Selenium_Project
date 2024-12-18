package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/ ");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7744838574");
		//sendkeys is a method of webelement
		//use to pass the value to the elements of broweser
	}

}
