package PomDDF_With_TestNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsTesting {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Desktop\\Excel1.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		SwagLabloginPage login=new SwagLabloginPage(driver);
		
		login.inputSwagLabloginPageUN(sheet.getRow(0).getCell(0).getStringCellValue());
		
		login.inputSwagLabloginPagePW(sheet.getRow(0).getCell(1).getStringCellValue());
		
		login.clickSwagLabloginPageLoginButton();
		Thread.sleep(2000);
		
		SwagLabHomePage home=new SwagLabHomePage(driver);
		home.VerifySwagLabHomePageLogo();
		Thread.sleep(2000);
		home.clickSwagLabHomePageOpenMenu();
		Thread.sleep(2000);
		
		SwagLabOpenMenu menu=new SwagLabOpenMenu(driver);
		menu.clickSwagLabOpenMenuLogOut();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
