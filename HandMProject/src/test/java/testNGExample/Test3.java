package testNGExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
	
	static WebDriver driver; 
	
	long overAllstartTime;
	long overAllendTime;
	
	@BeforeSuite
	public void openBrowser() {
		overAllstartTime = System.currentTimeMillis();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.close();
		overAllendTime = System.currentTimeMillis();
		long TotalTime=overAllendTime-overAllstartTime;
		System.out.println("Over All Total Time : "+TotalTime);
	}
	
	@Test
	public void Google() {
		long startTime = System.currentTimeMillis();
		driver.get("https://google.com/");
		long endTime = System.currentTimeMillis();
		long TotalTime=endTime-startTime;
		System.out.println("Google Total Time : "+TotalTime);
	}
	@Test
	public void wikipedia() {
		long startTime = System.currentTimeMillis();
		driver.get("https://www.wikipedia.org/");
		long endTime = System.currentTimeMillis();
		long TotalTime=endTime-startTime;
		System.out.println("WikiPideia Total Time : "+TotalTime);
	}
	@Test
	public void bing() {
		long startTime = System.currentTimeMillis();
		driver.get("https://www.bing.com/");
		long endTime = System.currentTimeMillis();
		long TotalTime=endTime-startTime;
		System.out.println("Bing Total Time : "+TotalTime);
	}

}
