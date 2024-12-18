package popups;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Child_Browser_PopUp {
	
	@Test
	public void childpop() throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> a1=new ArrayList<>(ids);
		System.out.println(a1.get(0));
		System.out.println(a1.get(1));
		
		driver.switchTo().window(a1.get(1));
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();

		Thread.sleep(2000);
		
		
		
		//driver.quit();
	}

}

