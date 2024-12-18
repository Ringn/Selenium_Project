package pomwithpagefactory;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		SwagLabloginPage login=new SwagLabloginPage(driver);
		login.inputSwagLabloginPageUN();
		login.inputSwagLabloginPagePW();
		login.clickSwagLabloginPageLoginButton();
		Thread.sleep(2000);
		
		SwagLabHomePage home=new SwagLabHomePage(driver);
		home.VerifySwagLabHomePageLogo();
		home.clickSwagLabHomePageOpenMenu();
		Thread.sleep(2000);
		
		SwagLabOpenMenu menu=new SwagLabOpenMenu(driver);
		menu.clickSwagLabOpenMenuLogOut();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
