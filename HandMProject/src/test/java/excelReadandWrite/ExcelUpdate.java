package excelReadandWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;



public class ExcelUpdate {
	
	//@Test
	public void excelUpdate() throws IOException {
		File file = new File("C:\\Users\\Yuvaraj\\OneDrive\\Desktop\\Attendance Tracker.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(1);
		String stringCellValue = cell.getStringCellValue();
		if(stringCellValue.equals("Prakash")) {
			cell.setCellValue("Yuvaraj Prakash");
			FileOutputStream fos =new FileOutputStream(file);
			wb.write(fos);
			wb.close();
		}
		
	}
	
	@Test
	public void jdbcConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn =DriverManager.getConnection("jdbc:mysql://root@localhost/yuvarajdb");
		Statement createStatement = conn.createStatement();
		ResultSet executeQuery = createStatement.executeQuery("SELECT * FROM superhero");
		
		while (executeQuery.next()) {
			String string = executeQuery.getString(2);
			String string1 = executeQuery.getString(3);
			System.out.println("userName : "+string+" password : "+string1);
		}
	
	}
	
	
}
