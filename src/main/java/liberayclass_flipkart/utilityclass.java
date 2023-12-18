package liberayclass_flipkart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utilityclass 
{
	public static String TestData(int Rowindex , int cellindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new  FileInputStream("C:\\selenium\\selenium_storedata.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("data");
		String value = sh.getRow(Rowindex).getCell(cellindex).getStringCellValue();
		return value;
		
	}
	

}
