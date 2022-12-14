package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	@BeforeSuite
	public void launch_Browser() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","E:\\Automation Testing
		// Tools\\Chrome Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://18.218.59.128/firstpage/public/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@AfterSuite
	public void Close_Browser() {

		driver.quit();
	}
}
