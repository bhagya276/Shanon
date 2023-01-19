package Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtiliP {
	public static String getT(int rowIndex,int cellIndex) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\lenovo\\Documents\\Bhagya\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		String data = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return data;
	}
}
