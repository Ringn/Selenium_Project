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

public class All_Data_Fetching {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//1.
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Downloads\\Excel2.xlsx");
		Workbook book = WorkbookFactory.create(file);
		
		Sheet s = book.getSheet("Sheet1");
		for(int i=0;i<=2;i++)
		{
			Row row = s.getRow(i);
			for(int j=0;j<=2;j++)
			{
				 Cell cell = row.getCell(j);
				System.out.print(cell.getStringCellValue()+" ");
			}
			System.out.println();
		}
		
	}

}
