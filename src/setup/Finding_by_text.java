package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finding_by_text {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Log in')] ")).click();
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		//syntax:-tagname[text()='completetextvalue']           =
		//tagname[contains(text(),'partialtextvalue')]          ,
		driver.findElement(By.xpath(" "));
		
	}
}
