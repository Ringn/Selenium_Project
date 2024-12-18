package custamizedlistbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Key_Use {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
	    WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		 
		 Actions act=new Actions(driver);
		 act.click(month).perform();
		 
		 for(int i=0;i<=9;i++)
		 {
			 act.sendKeys(Keys.ARROW_UP			).perform();
			 Thread.sleep(2000);
		 }
		 
		 act.sendKeys(Keys.ENTER).perform();
	}

}

