package POM_DDF_TestNg_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Class {
	
	//This method is use to get test data from excel sheet
	//need to pass two inputs rowindex colindex
	//@authorname:ashvaghosh
	
    public static String FetcExcelData(int rowindex,int colindex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Desktop\\Excel1.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String value = sheet.getRow(rowindex).getCell(colindex).getStringCellValue();
		
		return value;
	}


     public static void captureSS(WebDriver driver,int tcid) throws IOException 
     {
    	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	 File dest=new File("C:\\Users\\Pratiksha\\Documents\\screenshot\\tcid"+tcid+".jpg");
    	 
         FileHandler.copy(src, dest); 
	
     }

}
