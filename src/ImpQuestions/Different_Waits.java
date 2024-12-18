package ImpQuestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Different_Waits {
	public static void main(String[] args) 
	{
		//implicit wait: applicable for complete webpage.
		
		//explicit wait: applicable for each element in a page
		
		WebDriver driver=new ChromeDriver();
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("123456761");//if the element is find then it not wait for 30 sec
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(username));
		
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("45367");

		
	}

}
