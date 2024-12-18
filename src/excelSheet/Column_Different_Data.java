package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Column_Different_Data {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Downloads\\Excel2.xlsx");
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		int lastrow = sheet.getLastRowNum();
		
		for(int i=0;i<=lastrow;i++)
		{
			 Cell cell = sheet.getRow(i).getCell(0);
			 CellType type = cell.getCellType();
			 
			 if(type==CellType.NUMERIC)
			 {
				 System.out.println(cell.getNumericCellValue());
			 }
		   else if(type==CellType.STRING)
			 {
				 System.out.println(cell.getStringCellValue());
			 }
		   else if(type==CellType.BOOLEAN)
			 {
				 System.out.println(cell.getBooleanCellValue());
			 }
		}
	//output	 //123.0
		         //Class124
		         //Class125

		
	}

}
