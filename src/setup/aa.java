package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class aa {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.findElement(By.xpath("")).sendKeys("s");
	
	//WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
	//emailField.sendKeys("yourEmail@example.com");

}

}
