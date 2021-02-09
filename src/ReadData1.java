import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData1 {
	public static void main(String[] args) throws Exception {
		//File f = new File("‪‪F:\\Login1.xlsx");
		FileInputStream fis = new FileInputStream("F:\\Login1.xlsx‪‪");
		int i = fis.read();
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowcount = sh.getPhysicalNumberOfRows();
		Row firstRow = sh.getRow(0);
	/*	if (fis.exists()) {
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
	/*	FileInputStream fis = new FileInputStream("F:\\Login.xlsx‪‪");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowcount = sh.getPhysicalNumberOfRows();
		Row firstRow = sh.getRow(0);  */

}
}
