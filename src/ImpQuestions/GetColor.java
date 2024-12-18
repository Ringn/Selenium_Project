package ImpQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class GetColor {
	public static void main(String[] args) 
	{
		String bluecolorHexVal="#0866ff";
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		String clr = login.getCssValue("background-color");
		System.out.println(clr);
		
		String hexClr = Color.fromString(clr).asHex();
		System.out.println(hexClr);
		
		if(bluecolorHexVal.equals(hexClr))
		{
			System.out.println("Blue color");
		}
		else
		{
			System.out.println("Other color");
		}
		
		
		
	}

}
