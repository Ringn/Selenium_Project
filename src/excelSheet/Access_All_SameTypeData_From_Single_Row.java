package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Access_All_SameTypeData_From_Single_Row 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Downloads\\Excel2.xlsx");
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastcell = sheet.getRow(0).getLastCellNum()-1;//-1 because it provides length not index
		
		
		
		for(int i=0;i<=lastcell;i++)
		{
			Cell cell = sheet.getRow(0).getCell(i);
			System.out.print(cell.getStringCellValue()+" ");
		}
		
	}

}
