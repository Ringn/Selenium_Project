package Auto_Suggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion_Flipkart {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("redmi");
		String mobile="redmi 13c 5g";
		Thread.sleep(3000);
		List<WebElement> allsuggestions = driver.findElements(By.xpath("(//ul[@class='_1sFryS _2x2Mmc _3ofZy1'])//li"));
		
		for(WebElement s1:allsuggestions) {System.out.println(s1.getText());}
		for(WebElement s1:allsuggestions)
		{
			String actual = s1.getText();
			if(actual.contains(mobile))
			{
				s1.click();Thread.sleep(3000);
				break;
			}
		}
	
		driver.close();
		
		
	}

}

