package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class All_DiffrentType_Data {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Downloads\\Excel2.xlsx");
		
	    Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
	
	    int lastrow = sheet.getLastRowNum();
	    
	    for(int i=0;i<=lastrow;i++)
	    {
	    	int lastcell = sheet.getRow(i).getLastCellNum()-1;
	    	
	    	
	    	for(int j=0;j<=lastcell;j++)
	    	{
	    		Cell cell = sheet.getRow(i).getCell(j);
	    		CellType type=cell.getCellType();
	    		
	    		if(type==CellType.BOOLEAN)
	    		{
	    			System.out.print(cell.getBooleanCellValue()+" ");
	    		}
	    		else if(type==CellType.STRING)
	    		{
	    			System.out.print(cell.getStringCellValue()+" ");
	    		}
	    		else if(type==CellType.NUMERIC)
	    		{
	    			System.out.print(cell.getNumericCellValue()+" ");
	    		}
	    		
	    	}
	    	System.out.println();
	    	
	    }
	    
//	    123.0 abc1 bca1 true 
//	    Class124 false bca2 false 
//	    Class125 abc3 bca3 

	    
	    
	
	}

}
