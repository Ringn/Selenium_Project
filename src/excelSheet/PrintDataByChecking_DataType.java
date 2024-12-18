package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintDataByChecking_DataType {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Downloads\\Excel2.xlsx");
		
		Workbook book = WorkbookFactory.create(file);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		 Cell cell = sheet.getRow(0).getCell(0);
		 CellType type=cell.getCellType();
		//CellType is a enum
		System.out.println(type);
		
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

}
