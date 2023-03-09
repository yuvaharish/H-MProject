package excelReadandWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExample {

	static WebDriver driver;
	
	
	public String [][] loginData() {
		String [][] data= {
				{"Admin","admin12"},
				{"Admi","admin123"},
				{"Admi","admin12"},
				{"Admin","admin123"},
		};
		return data;
	}
	
	@DataProvider(name="login")
	public String[][] readexcel() throws IOException {
		File file = new File("C:\\Users\\Yuvaraj\\Desktop\\Attendance Tracker.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int noofrows = sheet.getPhysicalNumberOfRows();
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		
		String[][] data=new String[noofrows-1][lastCellNum];
		
		for (int i = 0; i < noofrows; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				DataFormatter df = new DataFormatter();
				data[i][j]= df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		return data;
	}
	
	@BeforeSuite
	public void before() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	
	@Test(dataProvider="login")
	public void ornHRM(String uName,String pass) {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement userName = driver.findElement(By.xpath("//*[@name='username']"));
		userName.sendKeys(uName);
		WebElement passWord = driver.findElement(By.xpath("//*[@type='password']"));
		passWord.sendKeys(pass);
		WebElement login = driver.findElement(By.xpath("//*[@type='submit']"));
		login.click();
	
	}
	
	@AfterSuite
	public void after() {
		driver.close();
	}
}
