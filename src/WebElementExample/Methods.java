package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/ ");
		WebElement e=driver.findElement(By.xpath("//input[@id='email']"));
		
		boolean b=driver.findElement(By.xpath("//button[text()='Log in']")).isEnabled();
		System.out.println(b);
		//if the element is present then it it shows true otherwise false
		
		
		boolean display = e.isDisplayed();
		System.out.println(display);
		
		String text=driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).getText();
		System.out.println(text);

		
	}

}
