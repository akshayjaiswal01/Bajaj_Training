package com.training.org;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("employee.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheetAt(0);
		
		for(Row row : sheet)
		{
			for(Cell cell : row)
			{
				switch(cell.getCellType())
				{
				case STRING:
					System.out.print(cell.getStringCellValue()+" ");
					break;
				
				case NUMERIC:
					System.out.print(cell.getNumericCellValue()+" ");
				}
			}
			System.out.println();
		}
		
		wb.close();
		fis.close();
	}
}
