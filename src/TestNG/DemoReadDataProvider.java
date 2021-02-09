package TestNG;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoReadDataProvider {
    @DataProvider
	public static String[][] demo() throws Exception {
		String[][] str;
		FileInputStream fis = new FileInputStream(new File("./ExcelSheet.xlsx"));
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowcount = sh.getPhysicalNumberOfRows();
		Row firstRow = sh.getRow(0);
		str = new String[rowcount - 1][firstRow.getLastCellNum()];
		for (int i = 1; i < rowcount; i++) {
			for (int j = 0; j < firstRow.getLastCellNum(); j++) {
			/*	Cell cl = sh.getRow(i).getCell(j);
				System.out.print(cl.toString() + "    ");   */
				
				str[i - 1][j] = sh.getRow(i).getCell(j).toString();
			}
		}
		return str;
	}
	
    @Test(dataProvider = "demo")
    public void tc(String user, String pass) {
    	Reporter.log(user +" "+ pass, true);
    }
	
}
