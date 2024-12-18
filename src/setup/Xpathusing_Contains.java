package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathusing_Contains
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address or phone ')]")).sendKeys("7744838574");
		
		////tagename[contains(@attributename,'partialattribute value')]
		
	}

}
