package TestNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwagLabTest {
	@Test
	public void name() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Desktop\\Excel1.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");
		
		SwagLab_LoginPage login=new SwagLab_LoginPage(driver);
		String username = sheet.getRow(0).getCell(0).getStringCellValue();
		login.inputSwagLab_LoginPageUN(username);
		String pass = sheet.getRow(0).getCell(1).getStringCellValue();
		login.inputSwagLab_LoginPagePW(pass);
		login.clickSwagLab_LoginPageLogin();
		
		SwagLabHomePage menu=new SwagLabHomePage(driver);
		menu.clickSwagLabHomePageOpenMenu();
		
		SwagLabLogOut log=new SwagLabLogOut(driver);
		log.clickSwagLabLogOutBTN();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
