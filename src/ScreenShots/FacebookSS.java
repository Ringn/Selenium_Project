package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FacebookSS {
	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File filedest = new File("C:\\Users\\Pratiksha\\Documents\\screenshot\\FacebookSS1.png");
		FileHandler.copy(src, filedest);
		
	}

}
