package com.training.org;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel 
{
	public static void main(String[] args) throws IOException 
	{
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet("Employee");
		
		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("ID");
		header.createCell(1).setCellValue("Name");
		header.createCell(2).setCellValue("Salary");
		
		Row row1 = sheet.createRow(1);
		row1.createCell(0).setCellValue(1);
		row1.createCell(1).setCellValue("AKshay");
		row1.createCell(2).setCellValue(50000);
		
		FileOutputStream fos = new FileOutputStream("employee.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
		
		System.out.println("Excel file created");
	}
}
