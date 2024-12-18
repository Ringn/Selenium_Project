package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Hole_Page_ScreenShot {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//for taking hole page screenshot
		//1. we need to downcast the driver object into TakeScreenshot interface
		
		TakesScreenshot src = ((TakesScreenshot)driver);
		//2.call the method getScreenshotAs using takescreenshot object
		//select output type as file
		//src.getScreenshotAs(OutputType.FILE);//strore the crceenshot in local memory
		
		File srcpath = src.getScreenshotAs(OutputType.FILE);//to transfer into known path
        File dest=new File("C:\\Users\\Pratiksha\\Documents\\screenshots\\image1.png");//stination path
		//use file handler to change the path of screenshot
		
	    FileHandler.copy(srcpath,dest);
	
	}
}
