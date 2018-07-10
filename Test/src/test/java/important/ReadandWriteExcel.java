package important;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadandWriteExcel {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		
		File src=new File("F:\\Java Selenium\\TestData\\SeleniumTestData.xlsx");
		 
		  
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook srcBook = new XSSFWorkbook(fis);     
        XSSFSheet sourceSheet = srcBook.getSheetAt(0);
        int rowcounter = 0;
		int rownum= rowcounter;
        XSSFRow sourceRow = sourceSheet.getRow(rownum);
        XSSFCell cell1=sourceRow.getCell(0);
        XSSFCell cell2=sourceRow.getCell(1);
        XSSFCell cell3=sourceRow.getCell(2);
        
        System.out.println(cell1);
        System.out.println(cell2);
        System.out.println(cell3);
}
}