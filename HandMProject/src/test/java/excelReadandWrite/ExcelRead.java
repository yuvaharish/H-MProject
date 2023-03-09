package excelReadandWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class ExcelRead {
	
	@Test
	public void excelRead() throws IOException {
		File file = new File("C:\\Users\\Yuvaraj\\OneDrive\\Desktop\\Attendance Tracker.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		
		for (int i = 0; i < rowCount; i++) {
			Row row = sheet.getRow(i);
			int cellCount = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cellCount; j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if(cellType==1) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}else if(cellType==0) {
					if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sd = new SimpleDateFormat("MM-dd-yyyy");
				String format = sd.format(dateCellValue);
				System.out.println(format);
					}else {
						double numericCellValue = cell.getNumericCellValue();
						long l=(long)numericCellValue;
					String valueOf = String.valueOf(l);
					System.out.println(valueOf);
					}
				}
			}
		}
	}

}
