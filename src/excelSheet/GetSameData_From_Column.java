package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetSameData_From_Column {
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file =new FileInputStream("C:\\Users\\Pratiksha\\Downloads\\Excel2.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("Sheet1");
		int lastcell = sheet.getRow(0).getLastCellNum();
		for(int i=0; i<=lastcell-1;i++)
		{
			Cell cell = sheet.getRow(0).getCell(i);
			System.out.print(cell.getNumericCellValue()+" ");
		}
	}

}
