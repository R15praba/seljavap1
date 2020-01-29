package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static String getData ( int rowNo, int cellNo) throws IOException   {
		String t=null;
	File fr = new File("C:\\Users\\murali\\eclipse-workspace\\Maven\\ExcelRead\\New.xlsx");	
	FileInputStream fi = new FileInputStream(fr);
	Workbook w = new XSSFWorkbook(fi);
	Sheet s1 = w.getSheet("sheet1");
	Row r = s1.getRow(rowNo);
	Cell c1 = r.getCell(cellNo);
	
	int type = c1.getCellType();
	if (type==1) {
		 t = c1.getStringCellValue();
		
	}
	else if (type==0) {
		if (DateUtil.isCellDateFormatted(c1)) {
			Date dateCellValue = c1.getDateCellValue();
			SimpleDateFormat sim =new SimpleDateFormat("dd-MMM-yy");
			 t = sim.format(dateCellValue);
			
		}
		else {
			double numericCellValue = c1.getNumericCellValue();
			long l= (long)numericCellValue;
		 t = String.valueOf(l);
		 System.out.println(t);
		}}
	
	return t;
	
	}
	}
	