package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abc {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sci.gov.in/");
		driver.findElement(By.xpath("//a[@title='Case Status']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()=' Diary Number']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='diary_no']")).sendKeys("18423");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
	}

}
