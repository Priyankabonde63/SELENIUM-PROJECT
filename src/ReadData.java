import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	public static void main(String [] args) throws Exception{
	FileInputStream fis = new FileInputStream("F:\\Login.xlsx‪‪");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("Sheet1");
	int rowcount = sh.getPhysicalNumberOfRows();
	Row firstRow = sh.getRow(0);
	
	}

}
