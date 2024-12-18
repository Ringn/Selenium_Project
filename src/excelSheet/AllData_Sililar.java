package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllData_Sililar {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Desktop\\Excel1.xlsx");
		
		Workbook book = WorkbookFactory.create(file);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		int lastrow = sheet.getLastRowNum();
		for(int i=0;i<=lastrow;i++)
		{
			int lastcell = sheet.getRow(i).getLastCellNum();
			for(int j=0;j<=lastcell-1;j++)
			{
				Cell cell = sheet.getRow(i).getCell(j);
				System.out.print(cell.getStringCellValue()+" ");
			}
			System.out.println();
		}
	}

}
