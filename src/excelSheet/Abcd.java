package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Abcd {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Downloads\\Excel2.xlsx");
		
		Workbook book = WorkbookFactory.create(file);
		
		Sheet sheet = book.getSheet("Sheet1");
		int lastrow=sheet.getLastRowNum();
		int lastcell = sheet.getRow(0).getLastCellNum()-1;
		for(int i=0;i<=lastrow;i++)
		{
			Row row = sheet.getRow(i);
			
			for(int j=0;j<=lastcell;j++)
			{
				Cell cell = row.getCell(j);
				System.out.print(cell.getStringCellValue());
				
			}
			System.out.println();
		}
		
	}

}
