package testNGExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExmple {

	
	
	@Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yuvaraj\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		long id = Thread.currentThread().getId();
		System.out.println("openGoogle id "+id);
	}
	@Test
	public void flipkart() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yuvaraj\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		long id = Thread.currentThread().getId();
		System.out.println("flipkart id "+id);
	}
	@Test
	public void openBing() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yuvaraj\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bing.com/");
		long id = Thread.currentThread().getId();
		System.out.println("openBing id "+id);
	}
	@Test
	public void openAmazon() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yuvaraj\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		long id = Thread.currentThread().getId();
		System.out.println("openAmazon id "+id);
	}
	
	@Test
	public void openGoogle1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yuvaraj\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		long id = Thread.currentThread().getId();
		System.out.println("openGoogle id "+id);
	}
	@Test
	public void flipkart1() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yuvaraj\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		long id = Thread.currentThread().getId();
		System.out.println("flipkart id "+id);
	}
	@Test
	public void openBing1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yuvaraj\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bing.com/");
		long id = Thread.currentThread().getId();
		System.out.println("openBing id "+id);
	}
	@Test
	public void openAmazon1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yuvaraj\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		long id = Thread.currentThread().getId();
		System.out.println("openAmazon id "+id);
	}
}
