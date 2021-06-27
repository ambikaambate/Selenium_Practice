package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDiffererntDataFromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/datadriven.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		
		String firstdata = workbook.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String seconddata = workbook.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		String thirddata = workbook.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		String fourthdata = workbook.getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
		System.out.println(firstdata+" "+seconddata+" "+thirddata+" "+fourthdata);
		
		Date date1 = workbook.getSheet("Sheet1").getRow(2).getCell(0).getDateCellValue();
		LocalDateTime date2 = workbook.getSheet("Sheet1").getRow(2).getCell(1).getLocalDateTimeCellValue();
		Date date3 = workbook.getSheet("Sheet1").getRow(2).getCell(2).getDateCellValue();
		System.out.println(date1+" "+date2+" "+date3);
		
	}

}
