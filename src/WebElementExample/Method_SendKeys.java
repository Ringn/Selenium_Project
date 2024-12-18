package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Method_SendKeys {
	
	@Test
	public void name() throws InterruptedException
	{
		//WebDriver is an interface use to perform actions on
		//element present on webpage
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://dashboard.jodo.in/login?next=/");
     	WebElement num = driver.findElement(By.xpath("//input[@name='username']"));
     	num.sendKeys("7744838574");
		//sendkeys method is use to enter value in text feild
     	//Thread.sleep(2000);
//    	Thread.sleep(2000);
//     	num.clear();//use to clear enter value
//     	Thread.sleep(2000);
     	
     	driver.findElement(By.xpath("//button[text()='Send OTP']")).click();

     	
    	Thread.sleep(2000);
     	//driver.quit();
		
	}

}
