package PomDDF_With_TestNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing {
	
	SwagLabloginPage login;
	SwagLabHomePage home;
	SwagLabOpenMenu menu;
	
	Sheet sheet;
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Desktop\\Excel1.xlsx");
		 sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 login=new SwagLabloginPage(driver);
		 home=new SwagLabHomePage(driver);
		 menu=new SwagLabOpenMenu(driver);
		
		
	}
	
	@BeforeMethod
	public void logintoapp() 
	{
		login.inputSwagLabloginPageUN(sheet.getRow(0).getCell(0).getStringCellValue());
		login.inputSwagLabloginPagePW(sheet.getRow(0).getCell(1).getStringCellValue());
		login.clickSwagLabloginPageLoginButton();
	}
	
	
	@Test
	public void popUp() 
	{
		home.clickSwagLabHomePageOpenMenu();
		
	}
	
	@AfterMethod
	public void Logout() 
	{
		menu.clickSwagLabOpenMenuLogOut();
		
	}
	
	
	@AfterClass
	public void CloseBrowser() 
	{
		menu.clickSwagLabOpenMenuLogOut();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
