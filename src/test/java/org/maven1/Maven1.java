package org.maven1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Maven1 {
	
public static void main(String[] args) throws IOException {
	
	File file=new File("C:\\Users\\S RAJA\\eclipse-workspace\\Maven\\TestData\\sheet1.xlsx");
	FileInputStream fileInputStream=new FileInputStream(file);
	Workbook book=new XSSFWorkbook(fileInputStream);
	Sheet sheet=book.getSheet("Sheet1");
	 for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
		
		 Row row=sheet.getRow(i);
		 for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
			   org.apache.poi.ss.usermodel.Cell cell = row.getCell(j);
			   int cellType = cell.getCellType();
			   if (cellType==1) {
				   String ss = cell.getStringCellValue();
				   System.out.println(ss);
				      
				
			}
			   else {
				   double numericCellValue = cell.getNumericCellValue();
				   long l=(long)numericCellValue;
				   System.out.println(l);
			   }
			 
			 
			 
			
		}
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
	
	
	
	
	
}

	
  
	
	


}