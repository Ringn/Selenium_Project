package Auto_Suggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuto_Suggestion {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		String mobile="redmi note 13";
		Thread.sleep(2000);
		List<WebElement> allsuggestions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li//div[@class='wM6W7d']"));
		
		for(WebElement s1:allsuggestions)
		{
			System.out.println(s1.getText());
			String actual = s1.getText();
			if(actual.equals(mobile))
			{
				s1.click();
				break;
			}
		}
	
		
		
	}

}
