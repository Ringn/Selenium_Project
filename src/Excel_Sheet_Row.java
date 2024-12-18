import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Sheet_Row {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Downloads\\Excel2.xlsx");
		
		Workbook book = WorkbookFactory.create(file);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		int lastcell = sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<=lastcell-1;i++)
		{
			Cell cell = sheet.getRow(0).getCell(i);
			CellType type=cell.getCellType();
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
