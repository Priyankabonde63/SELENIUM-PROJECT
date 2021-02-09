import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {
	public static void main(String[] args) throws Exception {
		FileInputStream fis =new FileInputStream(new File("./Demo.xlsx"));
		System.out.println("2");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
	//	Sheet sh = wb.createSheet("Ankur");
		Cell c1 = sh.createRow(0).createCell(0);
		c1.setCellValue("USERNAME");
		sh.getRow(0).createCell(1).setCellValue("PASSWORD");
		sh.createRow(1).createCell(0).setCellValue("ADMIN");
		sh.getRow(1).createCell(1).setCellValue("MANAGER");
		FileOutputStream fio =new FileOutputStream(new File("./Demo.xlsx"));
		wb.write(fio);
		System.out.println("Done");
		wb.close();
		System.out.println("Done ty");
}
}
