package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("7744838574");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//now to handel alert popup switch to aletrt pop up using
		Alert alt = driver.switchTo().alert();
		
		//then to get the text of alert box
		String text = alt.getText();
		System.out.println(text);
		//click on cancel button
		//alt.dismiss();
		//click on ok button
		Thread.sleep(2000);
		alt.accept();
		Thread.sleep(2000);
		alt.accept();
		
	}

}
