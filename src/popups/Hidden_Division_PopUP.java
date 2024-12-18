package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hidden_Division_PopUP {
	
	@Test
	public void pop() throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mobikwik.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		Thread.sleep(2000);
		WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
		
		mail.sendKeys("7744838574");
		
		
	}

}
