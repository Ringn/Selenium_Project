package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abcd {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//webElement s3=driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		//S3.sendKeys("7755664433");
		WebElement e=driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		
		e.sendKeys("7744553322");
		e.clear();
		String s=driver.getCurrentUrl();
		System.out.println(s);
		
		String s2="https://www.facebook.com/";
		if(s.equalsIgnoreCase(s2))
		{
			System.out.println("navigate to currect page");
		}
		else
		{
			System.out.println("navigate to wrong page");
		}
		
	}

}
