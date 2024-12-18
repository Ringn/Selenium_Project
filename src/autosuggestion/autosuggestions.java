package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class autosuggestions {
	@Test
	public void tc1() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("dr. ambedkar book names show in suggestion");
		Thread.sleep(2000);
	    List<WebElement> books = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li"));	
		
	    Thread.sleep(2000);
	    for(WebElement b:books)
	    {
	    	System.out.println(b.getText());
	    	
	    }
	    books.get(1).click();
	    
	}

}
