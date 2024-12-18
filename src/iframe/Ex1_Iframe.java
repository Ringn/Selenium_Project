package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_Iframe {

	public static void main(String[] args) throws InterruptedException 
	{
		//what is iframe: = displaying webpage as a part of another webpage is called ifreme
		//iframe is created using tagname iframe
		//to perform action on iframe we neewd to switch from main page to frame
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switching from main page to frame
		driver.switchTo().frame("iframeResult");
		
	//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));//this is id in frame tag
		
		//then perform action on elements of frame
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@id='runbtn']")).click();
		//it will show nosuchelementexception
		
		driver.switchTo().defaultContent();//switch to main page directly
		driver.findElement(By.xpath("//button[@id='runbtn']")).click();
				//it will run after switching to main page
		
		driver.switchTo().parentFrame();//it will switch to imediate parent
		
		
		
	}
}
