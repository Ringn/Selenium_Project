package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class All_Data_From_Row {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Downloads\\Excel2.xlsx");
		
	    Workbook book = WorkbookFactory.create(file);
	    
	     Sheet sheet = book.getSheet("Sheet1");
	     int lastrow = sheet.getLastRowNum();
	    		
	    		for(int i=0;i<=lastrow;i++)
	    		{
	    		Cell cell = sheet.getRow(i).getCell(0);
	    		
	    		CellType type = cell.getCellType();
	    		if(type==CellType.BOOLEAN)
				{
					System.out.print(cell.getBooleanCellValue()+" ");
				}
				if(type==CellType.STRING)
				{
					System.out.print(cell.getStringCellValue()+" ");
				}
				if(type==CellType.NUMERIC)
				{
					System.out.print(cell.getNumericCellValue()+" ");
				}
	    		}
	    
	}

}
