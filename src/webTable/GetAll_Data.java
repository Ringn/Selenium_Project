package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAll_Data {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Pratiksha/Desktop/table.html");
		
		
		List<WebElement> allrow = driver.findElements(By.xpath("//table//tr"));
		
		
        for(int i=1;i<=allrow.size();i++)
        {
        	List<WebElement> Colsize = driver.findElements(By.xpath("//table//tr["+i+"]//td"));
        	
        	for(int j=1;j<=Colsize.size();j++)
        	{
        		 String text = driver.findElement(By.xpath("//table//tr["+i+"]//td["+j+"]")).getText();
            	
        		 System.out.print(text+" ");
        	}
        	System.out.println();
    		
        }
	}

}

