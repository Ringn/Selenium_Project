package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Row_Different_Data {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Downloads\\Excel2.xlsx");
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		int lastcell = sheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=lastcell;i++)
		{
			 Cell cell = sheet.getRow(0).getCell(i);
			 CellType type = cell.getCellType();
			 
			 if(type==CellType.NUMERIC)
			 {
				 System.out.print(cell.getNumericCellValue()+" ");
			 }
		   else if(type==CellType.STRING)
			 {
				 System.out.print(cell.getStringCellValue()+" ");
			 }
		   else if(type==CellType.BOOLEAN)
			 {
				 System.out.print(cell.getBooleanCellValue()+" ");
			 }
		}
	//output	//123.0 abc1 bca1 true
		
	}

}
