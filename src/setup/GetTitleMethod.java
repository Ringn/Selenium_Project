package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		String expecttitle="WhatsApp Web";
				
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals(expecttitle))
		{
			System.out.println("navigate: to currect web page");
			
		}
		else
		{
			System.out.println("wrong web page");
		}
		
		
	}

}
