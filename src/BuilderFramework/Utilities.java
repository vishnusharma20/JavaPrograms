package BuilderFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.Test;

public class Utilities {
	
	HSSFWorkbook wb;
	HSSFSheet sh;
	String Hotel_Name="HotelName";
	String Price="Price";
	String Rating="Rating";
	
	@Test
	public void getData() throws IOException {
		
		File file = new File("C:\\Users\\mmt7667\\Desktop\\NewbuilderData.xls");
	    FileInputStream inputStream = new FileInputStream(file);
		
		wb = new HSSFWorkbook(inputStream);
		sh= wb.getSheet("Sheet1");
		
	
		
		int rowcount=sh.getLastRowNum()-sh.getFirstRowNum();
		/*for(int i=0;i<rowcount+1;i++) {
			Row row= sh.getRow(i);
		//	if(row.getCell(0).getStringCellValue().equals(Hotel_Name))
			 for (int j = 0; j < row.getLastCellNum(); j++) {
				 
		            System.out.print(row.getCell(j)+ " ");
		}
			 System.out.println();
		}*/
		
	/*	while(rowcount>0) {
			Map<Cell, Integer> map = new HashMap<>();
			for(int i=0;i<rowcount+1;i++) {
				Row row=sh.getRow(i);
				map.put(row.getCell(i), (int) row.getCell(i).getNumericCellValue());
				System.out.println(map);
			}
			
		}
		*/
	}
	

}
