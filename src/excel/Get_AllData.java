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

public class Get_AllData {
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
    	 
    	 int lastrow = sheet.getLastRowNum();
    	 
    	 for(int i=0;i<=lastrow-1;i++)
    	 {
    		int lastcell = sheet.getRow(i).getLastCellNum();
    		
    		for(int j=0;j<=lastcell-1;j++)
    		{
    			System.out.print(sheet.getRow(i).getCell(j));
    			
    		}
    		
    		System.out.println();
    	 }
		
	 }	

}

