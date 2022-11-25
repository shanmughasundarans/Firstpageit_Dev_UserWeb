package Referance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Dropdown {
	String baseurl = "https://ftuserdev.tokenomicsdaily.com/";
	 WebDriver driver;
@BeforeSuite
	public   void user_get_landed_on_to_login_page() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(baseurl);
		
}
@Test
public  void  Drop_Down() {

	
	
	
	
	
	
}

}