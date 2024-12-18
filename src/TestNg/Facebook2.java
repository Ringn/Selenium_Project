package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class Facebook2 {

    @Test
    public void tc1() throws InterruptedException {
        
 
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");


        // Test Step 1: Wait and enter email (valid XPath)
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("7744838574");

        // Test Step 2: Use findElements to check if password field is available (no exception thrown)
        List<WebElement> passwordFields = driver.findElements(By.xpath("//input[@id='wrong-password-field']"));
        

        Thread.sleep(2000); 
        driver.findElement(By.xpath("//button[@name='login']")).click();
        

        Thread.sleep(2000);
       // driver.quit();

       
    }
}
