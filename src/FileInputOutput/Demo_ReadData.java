package FileInputOutput;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo_ReadData {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(new File("./ExcelSheet.xlsx"));
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowcount = sh.getPhysicalNumberOfRows();
		Row firstrRow = sh.getRow(0);
		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < firstrRow.getLastCellNum(); j++) {
				Cell cl = sh.getRow(i).getCell(j);
				System.out.print(cl.toString() + "    ");
			}
			System.out.println();
		}
	}

}
