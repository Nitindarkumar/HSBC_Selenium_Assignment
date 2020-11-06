package assertionsassignment3;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReading {
	 
	 @Test
	 public void fun() throws IOException {
		 FileInputStream excelFile = new FileInputStream("C:\\Users\\Nitin_Rathod\\eclipse-workspace\\Aasignment\\Dada.xlsx");
	    	HSSFWorkbook wb=new HSSFWorkbook(excelFile);
	 		HSSFSheet sheet=wb.getSheetAt(0);
	 		
//	 		String cell1=sheet.getRow(0).getCell(0).getStringCellValue();
//	 		String cell2=sheet.getRow(1).getCell(0).getStringCellValue(); 
//	 		
//	 		System.out.println(cell1);
//	 		System.out.println(cell2);
	 		
	 		
	 }
	 
}
