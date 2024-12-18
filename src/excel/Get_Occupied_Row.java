package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Get_Occupied_Row {
	//step1:to fetch data from excel sheet first we need to configure apache poi jar file into our project
	//step2:create an excel sheet with some data
	//step3:create object of fileinputstream class with excel sheet path as an input
	//step4:to open excel sheet use create method present under workbook factory class
	//step5:then to open particular sheet use get sheet method
	//step6:and use getrow and getsheet method
	
	@Test
     public void name() throws EncryptedDocumentException, IOException 
     {
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Desktop\\Excel1.xlsx");

    	 Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
    	 
    	 int lastcell = sheet.getRow(0).getLastCellNum();
    	 
    	 for(int i=0;i<=lastcell-1;i++)
    	 {
    		 System.out.println(sheet.getRow(0).getCell(i));
    	 }
		
	 }	

}
