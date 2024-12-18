package ImpQuestions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluient_Wait {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		FluentWait wait=new FluentWait(driver);
		//specify the time out of the wait
		wait.withTimeout(Duration.ofSeconds(34));
		
		//specify polling time
		wait.pollingEvery(Duration.ofSeconds(1/2));
		
		//specify waht exception to ignore
		wait.ignoring(NoSuchElementException.class);
		
		//this is how we specidfy the condition to wait on
		
		wait.until(ExpectedConditions.alertIsPresent());
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("123456761");
		
	}

}
