package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FacebookSS2 {
	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement button = driver.findElement(By.xpath("//button[@value='1']"));
		Thread.sleep(2000);
		File src = ((TakesScreenshot)button).getScreenshotAs(OutputType.FILE);
		
		File filedest = new File("C:\\Users\\Pratiksha\\Documents\\screenshot\\FacebookSS2.png");
		FileHandler.copy(src, filedest);
		
	}

}
