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

public class Fetching_String_From_Excel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//1.
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Downloads\\Excel2.xlsx");
		//to access the excel sheet first we have to 
		//create  the object of fileinputstring class and in the constructor of 
		//it pass the excel sheet path
		
		//2.
		
		Workbook book = WorkbookFactory.create(file);
		//to open the excel sheet use the Workbookfactory class static method
		//create
		
		//3.
		Sheet sh = book.getSheet("Sheet1");
		//to accees the specific sheet use getsheet method
		
		//4.
		Row rw = sh.getRow(2);
		//5.
		Cell cell = rw.getCell(0);
		
		
		//6.
		String value = cell.getStringCellValue();
		System.out.println(value);
		
		
	}

}
