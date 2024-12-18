package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetallData_SameType_From_Column {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Downloads\\Excel2.xlsx");
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastrow = sheet.getLastRowNum();//returns last index not size
		
		for(int i=0;i<=lastrow;i++)
		{
			Cell cell = sheet.getRow(i).getCell(0);
			System.out.println(cell.getStringCellValue());
		}
		
	}

}
