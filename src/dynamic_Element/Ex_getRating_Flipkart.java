package dynamic_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_getRating_Flipkart {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("redmi 13c 5g");
		//click on search icon
		driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']")).click();
		
		Thread.sleep(2000);
		//String text = driver.findElement(By.xpath("(//div[@class='_5OesEi']//span[@class='Wphh3N']//span[contains(text(),'15,469 Ratings')])[1]")).getText();
//******	//it will print but the rating is dynamic so
		//System.out.println(text);
		
		String text = driver.findElement(By.xpath("((//div[@class='tUxRFH'])[1]//span)[6]")).getText();
		
		System.out.println(text);
	}

}
