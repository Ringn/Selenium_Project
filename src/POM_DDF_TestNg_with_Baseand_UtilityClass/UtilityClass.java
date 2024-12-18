package POM_DDF_TestNg_with_Baseand_UtilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass {
	
	
	public static void ExcelData() throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Desktop\\Excel1.xlsx");
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		
	}

}
