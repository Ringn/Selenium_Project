package setup;

import org.openqa.selenium.chrome.ChromeDriver;

public class Opening_Chrome_Browser {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
