package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert_Pop_Up {
	
	@Test
	public void Alrtpop() throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		System.out.println(alt.getText());
		
		driver.quit();
	}

}
