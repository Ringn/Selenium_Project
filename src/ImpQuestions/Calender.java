package ImpQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	
		//step1:
		driver.findElement(By.cssSelector("#datepicker"));
		
		Thread.sleep(2000);
		
		//navigate to expected month>sep
		
		while(!driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText().contains("sep"))		
		{		
			Thread.sleep(1000);
			//click on next button
			driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e")).click();
			
			Thread.sleep(1000);		
		}
		Thread.sleep(1000);
		
		//step3: select expected date
		
		List<WebElement> alldates = driver.findElements(By.cssSelector("//table//tr//td/a[@class='ui-state-default']"));
		
		for(WebElement date:alldates)
		{
			if(date.getText().equals("20"))
			{
				date.click();
				break;
			}
				
	     }
		
	}
}


