package testNGExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizationExampl {
	
	static WebDriver driver;
	
	@Test
	@Parameters("browserName")
	public void openbrowser(String browserName) {
		switch (browserName) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();	
			driver = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();	
			driver = new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		}
	}

	@Test
	public void opensite() {
		driver.get("https://google.com/");
	}
}
