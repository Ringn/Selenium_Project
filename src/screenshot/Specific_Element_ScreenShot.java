package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Specific_Element_ScreenShot {
	public static void main(String[] args) throws IOException
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement src = driver.findElement(By.xpath("//button[@value='1']"));
		
		File srcpath = src.getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\Pratiksha\\Documents\\screenshot\\image2.png");
		FileHandler.copy(srcpath,dest);
		
		
		//for specific eleement scrrenshot we dont need to downcast to takescreenshot interface
		//because the method getScreenshotAs is also present in webelement
	}

}
