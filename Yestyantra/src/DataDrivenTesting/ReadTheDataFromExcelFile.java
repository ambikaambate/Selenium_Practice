package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTheDataFromExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./TestData/datadriven.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		
		String firstdata = workbook.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String seconddata = workbook.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		String thirddata = workbook.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		String fourthdata = workbook.getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
		System.out.println(firstdata+" "+seconddata+" "+thirddata+" "+fourthdata);
		
		double data1 = workbook.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		double data2 = workbook.getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		double data3 = workbook.getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue();
		double data4 = workbook.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(data1+" "+data2+" "+data3+" "+data4);
		
		String value1 = workbook.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		String value2 = workbook.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		String value3 = workbook.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
		String value4 = workbook.getSheet("Sheet1").getRow(2).getCell(3).getStringCellValue();
		System.out.println(value1+" "+value2+" "+value3+" "+value4);
		
		String firstdata1 = workbook.getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		String seconddata2 = workbook.getSheet("Sheet2").getRow(0).getCell(1).getStringCellValue();
		String thirddata3= workbook.getSheet("Sheet2").getRow(0).getCell(2).getStringCellValue();
		String fourthdata4= workbook.getSheet("Sheet2").getRow(0).getCell(3).getStringCellValue();
		System.out.println(firstdata1+" "+seconddata2+" "+thirddata3+" "+fourthdata4);
		
		double data1value = workbook.getSheet("Sheet2").getRow(1).getCell(0).getNumericCellValue();
		double data2value = workbook.getSheet("Sheet2").getRow(1).getCell(1).getNumericCellValue();
		double data3value = workbook.getSheet("Sheet2").getRow(1).getCell(2).getNumericCellValue();
		double data4value = workbook.getSheet("Sheet2").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(data1value+" "+data2value+" "+data3value+" "+data4value);
		
		
		
		
		
	}
}
