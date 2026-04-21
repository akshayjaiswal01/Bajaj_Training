package com.training.org;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.*;

public class UpdateExcel {
    public static void main(String[] args) {
        String filePath = "employee.xlsx";
        Workbook wb = null;

        try {
            
            try (FileInputStream fis = new FileInputStream(filePath)) {
                wb = WorkbookFactory.create(fis);
            } 

           
            Sheet sheet = wb.getSheetAt(0);

            
            Row row = sheet.getRow(1);
            if (row == null) {
                row = sheet.createRow(1);
            }

            
            Cell cell = row.getCell(2);
            if (cell == null) {
                cell = row.createCell(2);
            }

            
            cell.setCellValue(60000);

            
            try (FileOutputStream fos = new FileOutputStream(filePath)) {
                wb.write(fos);
            }

            System.out.println("Excel updated successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (wb != null) {
                    wb.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}