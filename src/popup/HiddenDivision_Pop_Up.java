package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision_Pop_Up {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.mobikwik.com/");
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		
		WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
		
		mail.sendKeys("7744838574");
	}

}
