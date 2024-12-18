package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class className_Locator {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(2000);
		
		driver.findElement(By.className("_aa4b")).sendKeys("abs");
		
	}

}
