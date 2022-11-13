package servicenow;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	
	public static String[][] getData(String excelfilename) throws IOException
	{
		XSSFWorkbook book = new XSSFWorkbook("./TestData/"+excelfilename+".xlsx");
		
		XSSFSheet sheet = book.getSheetAt(0);
		
		int rowcount = sheet.getLastRowNum();
		System.out.println("RowCount: "+rowcount);
		
		XSSFRow headerRow = sheet.getRow(0);
		short colCount = headerRow.getLastCellNum();
		
		System.out.println("Column Count: "+ colCount);
		
		//Created 2D array to store the date
		
		String[][] data = new String[rowcount][colCount];
		
		for(int i=1; i<=rowcount; i++)
		{
			XSSFRow eachRow = sheet.getRow(i);
			
			for(int j=0; j<colCount; j++) {
				XSSFCell eachcell = eachRow.getCell(j);
				String value = eachcell.getStringCellValue();
				data[i-1][j] = value;
				System.out.println(value);
			}
		}
		book.close();
		return data;
	}

}
