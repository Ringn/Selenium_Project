package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_PopUp {
	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
