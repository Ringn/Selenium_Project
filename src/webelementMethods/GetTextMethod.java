package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/ ");
	WebElement s=driver.findElement(By.xpath("//input[@id='email']"));
	s.sendKeys("7744838574");
	s.getText();
		//sendkeys is a method of webelement
		//use to pass the value to the elements of broweser
	}

}

