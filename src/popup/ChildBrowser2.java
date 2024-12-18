package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser2 {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//first check by directly clicking
		//driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		//we will get child browser error
		
		//so 1st get child window id
		Set<String> allid = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(allid);//main pageid(0)
		//childpageid (1)
		
		
		//switch to child window
		driver.switchTo().window(al.get(1));
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		Thread.sleep(2000);
		
		//switch to main page
		driver.switchTo().window(al.get(0));
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		//now switch to child browser2
		Set<String> allids = driver.getWindowHandles();
		ArrayList<String> all=new ArrayList<>(allids);//main pageid(0)
		Thread.sleep(2000);
		driver.switchTo().window(all.get(2));
		driver.findElement(By.xpath("(//i[@class=' mw-icon the7-mw-icon-search-bold'])[3]")).click();
		Thread.sleep(2000);
		driver.switchTo().window(al.get(1));
	}

}

