package HomePage;

import static org.testng.Assert.assertFalse;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class rough2 {

	WebDriver  driver;
	@BeforeSuite
	public void launch_Browser() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","D:\\\\Testing\\\\Selenium\\\\ChromeDriver\\\\chromedriver.exe");
			driver =new ChromeDriver();
			
			driver.get("http://18.218.59.128/firstpage/public/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
	}
				
		@Test(priority=27,enabled=true)
		public void FIPGTS_00003_FIPGTS_00006() throws InterruptedException {
			
			driver.get("http://18.218.59.128/firstpage/public/Know_More#pitch");
			Actions act=new Actions(driver);
			Thread.sleep(2000);
			WebElement FIPGTS_00003_FIPGTS_00006_knowmore_WhatsFP = driver.findElement(By.xpath("//a[contains(text(),'Know More')]"));
			act.moveToElement(FIPGTS_00003_FIPGTS_00006_knowmore_WhatsFP).perform();
			Thread.sleep(2000);
			String FIPGTS_00003_FIPGTS_00006_homeur= driver.getCurrentUrl();
			
			WebElement FIPGTS_00003_FIPGTS_00006_knowmore_WhatsFP1= driver.findElement(By.xpath("//*[contains(text(),'What is FP?')]"));
			FIPGTS_00003_FIPGTS_00006_knowmore_WhatsFP1.click();
			
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			
			System.out.println("No. of tabs: " + tabs.size());
			
			int store = tabs.size();
			Assert.assertEquals(store, 1);
			
				Actions action = new Actions(driver);
				action.moveByOffset(200,100).perform();
				Thread.sleep(2000);
				action.click();
				
		}
				
		@Test(priority=28,enabled=true)
		public void FIPGTS_00003_FIPGTS_00007() throws InterruptedException {
			
			String FIPGTS_00003_FIPGTS_00007_FirstPageHome=driver.getWindowHandle();
			Actions act=new Actions(driver);
			WebElement FIPGTS_00003_FIPGTS_00007_knowmore = driver.findElement(By.xpath("//a[contains(text(),'Know More')]"));
			act.moveToElement(FIPGTS_00003_FIPGTS_00007_knowmore).perform();
			Thread.sleep(2000);
			String FIPGTS_00003_FIPGTS_00007_homeurl= driver.getCurrentUrl();
										
			WebElement FIPGTS_00003_FIPGTS_00007_Detailedinstruction= driver.findElement(By.xpath("//a[contains(text(),'Detailed Instructions')]"));
			FIPGTS_00003_FIPGTS_00007_Detailedinstruction.click();
			Thread.sleep(2000);
			Set<String>Allwindows=driver.getWindowHandles();
			for (String FIPGTS_00003_FIPGTS_00007_detailedinstruction : Allwindows) {
				driver.switchTo().window(FIPGTS_00003_FIPGTS_00007_detailedinstruction);
				String FIPGTS_00002_FIPGTS_00007_currentwindow=driver.getCurrentUrl();
			}
				if(driver.getCurrentUrl().equals("http://18.218.59.128/firstpage/public/detailed_instructions")){
					System.out.println("FIPGTS_00003_FIPGTS_00007 = Pass");
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(FIPGTS_00003_FIPGTS_00007_FirstPageHome);
				}
				else {
					
					System.out.println("FIPGTS_00003_FIPGTS_00007=  Fails");
				}
				
		}
		@Test(priority=29,enabled=true)
		public void FIPGTS_00003_FIPGTS_00008() throws InterruptedException {
			

			Actions act=new Actions(driver);
			WebElement FIPGTS_00003_FIPGTS_00008_knowmore = driver.findElement(By.xpath("//a[contains(text(),'Know More')]"));
			act.moveToElement(FIPGTS_00003_FIPGTS_00008_knowmore).perform();
			Thread.sleep(2000);
			String FIPGTS_00003_FIPGTS_00008_homeurl= driver.getCurrentUrl();
			
			WebElement FIPGTS_00003_FIPGTS_00008_videos= driver.findElement(By.xpath("//*[contains(text(),'Videos')]"));
			FIPGTS_00003_FIPGTS_00008_videos.click();
			Set<String>Allwindows=driver.getWindowHandles();
			for (String FIPGTS_00003_FIPGTS_00008_videos1 : Allwindows) {
				driver.switchTo().window(FIPGTS_00003_FIPGTS_00008_videos1);
				String FIPGTS_00003_FIPGTS_00008_currentwindow=driver.getCurrentUrl();
			}
				if(driver.getCurrentUrl().equals("http://18.218.59.128/firstpage/public/Know_More#videos")){
					System.out.println(" FIPGTS_00003_FIPGTS_00008 = Pass");
					Thread.sleep(2000);
					
				}
				else {
					
					System.out.println(" FIPGTS_00003_FIPGTS_00008 = Fails");
				
		}
		}
		@Test(priority=30,enabled=true)
		public void FIPGTS_00003_FIPGTS_00009() throws InterruptedException {
			
			String FIPGTS_00003_FIPGTS_00009_FirstPageHome=driver.getWindowHandle();
			Actions act=new Actions(driver);
			WebElement FIPGTS_00003_FIPGTS_00009_knowmore = driver.findElement(By.xpath("//a[contains(text(),'Know More')]"));
			act.moveToElement(FIPGTS_00003_FIPGTS_00009_knowmore).perform();
			Thread.sleep(2000);
			String FIPGTS_00003_FIPGTS_00009_homeurl= driver.getCurrentUrl();
			
			WebElement FIPGTS_00003_FIPGTS_00009_BecomeRstar= driver.findElement(By.xpath("//a[contains(text(),'Become an RStar')]"));
			FIPGTS_00003_FIPGTS_00009_BecomeRstar.click();
//			Set<String>Allwindows=driver.getWindowHandles();
//			for (String FIPGTS_00003_FIPGTS_00009_BecomeRstar1 : Allwindows) {
//				driver.switchTo().window(FIPGTS_00003_FIPGTS_00009_BecomeRstar1);
//				
//			}
			String currentwindow=driver.getCurrentUrl();
				if(driver.getCurrentUrl().equals("http://18.218.59.128/firstpage/public/Know_More#become_a_rstar")){
					System.out.println("FIPGTS_00003_FIPGTS_00009= Pass");
					Thread.sleep(2000);
//					driver.close();
//					driver.switchTo().window(FIPGTS_00003_FIPGTS_00009_FirstPageHome);
				}
				else {
					
					System.out.println("FIPGTS_00003_FIPGTS_00009= Fails");
				}
				
					
		
		}


		@AfterSuite
		public void Close_Browser() {

			driver.close();
	}
}
		
		

			
			

		
	
