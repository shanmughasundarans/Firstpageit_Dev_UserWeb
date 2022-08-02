package HomePage;

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

public class Rough {
	WebDriver  driver;
@BeforeSuite
public void launch_Browser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.get("http://18.218.59.128/firstpage/public/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
}
@Test(priority=1,enabled=true)
public void FIPGTS_00001_FIPGTS_00001() throws InterruptedException {
	WebElement Firstpageit = driver.findElement(By.xpath("//img[@class='img-fluid']"));
	Firstpageit.click();
	Thread.sleep(2000);   
		}

@Test(priority=2,enabled=true)
	public void FIPGTS_00002() throws InterruptedException {
		
		WebElement SearchBox = driver.findElement(By.xpath("//input[@class='search_input']"));
		SearchBox.click();
		Thread.sleep(2000);
	
	String ActualURL = driver.getCurrentUrl();
	String ExpectedURL = "http://18.218.59.128/firstpage/public/Know_More";
	Assert.assertEquals(ActualURL, ExpectedURL);
System.out.println("FIPGTS_00001_Assertion_Passed " +ActualURL);
Thread.sleep(2000);
driver.navigate().back();
}
@Test(priority=3,enabled=true)
public void FIPGTS_00001_FIPGTS_00003() throws InterruptedException {
	
	Actions act=new Actions(driver);
	WebElement Knowmore = driver.findElement(By.xpath("//a[text()='Know More']"));
	act.moveToElement(Knowmore).perform();
	//KnowMore options
	Thread.sleep(2000);
	Boolean Display1 = driver.findElement(By.xpath("//*[contains(text(),'What is FP?')]")).isDisplayed();
	System.out.println("FIPGTS_00003_Knowmore_WhatsFPOption_Element displayed is :"+Display1);
	//Detailed Instructions
	Boolean Display2 = driver.findElement(By.xpath("//*[contains(text(),'Detailed Instructions')]")).isDisplayed();
	System.out.println("Knowmore_DetailedInstructionOption_Element displayed is :"+Display2);
	
	//Become a Rstar
	Boolean Display3 = driver.findElement(By.xpath("//*[contains(text(),'Videos')]")).isDisplayed();
	System.out.println("Knowmore_Video_Option_Element displayed is :"+Display3);
	
//BecomeRstar
	Boolean Display4 = driver.findElement(By.xpath("//a[contains(text(),'Become an RStar')]")).isDisplayed();
	System.out.println("Knowmore_BecomeAnRstar_Option_Element displayed is :"+Display4);
	
	//TOS
	Boolean Display5 = driver.findElement(By.xpath("//a[contains(text(),'TOS/Privacy Policy')]")).isDisplayed();
	System.out.println("Knowmore_TOS_Option_Element displayed is :"+Display5);
	
	
//Contactus
	Boolean Display6 = driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).isDisplayed();
	System.out.println("Knowmore_Contactus_Option_Element displayed is :"+Display6);
	
	
	
      }
@Test(priority=4,enabled=true)
public void FIPGTS_00001_FIPGTS_00004() throws InterruptedException {
	Actions act=new Actions(driver);
	WebElement Knowmore = driver.findElement(By.xpath("//*[contains(text(),'SignUp/LogIn')]"));
	act.moveToElement(Knowmore).perform();
	Thread.sleep(2000);
	//Signinoptions
	Boolean Display1 = driver.findElement(By.xpath("//*[contains(text(),'User SignUp/Login')]")).isDisplayed();
	System.out.println("FIPGTS_00004 Signinlogin_normaluser_option_Element displayed is :"+Display1);
	//login options
	Boolean Display2 = driver.findElement(By.xpath("//a[contains(text(),'RStar SignUp/Login')]")).isDisplayed();
	System.out.println("FIPGTS_00004 Signinlogin_Rstaruser_optionElement displayed is :"+Display2);
}

//Knowmore Option is highlighted
@Test(priority=5,enabled=true)
public void FIPGTS_00001_FIPGTS_00005() throws InterruptedException {
	 
	Actions act=new Actions(driver);
	WebElement Knowmore = driver.findElement(By.xpath("//a[text()='Know More']"));
	act.moveToElement(Knowmore).perform();
	Thread.sleep(2000);
	WebElement WhatsFP = driver.findElement(By.xpath("//a[text()='What is FP?']"));
	
	act.moveToElement(WhatsFP).perform();
//	 String textColor = driver.findElement(By.xpath("//a[text()='What is FP?']")).getCssValue("color");
//	    String bkgColor = driver.findElement(By.xpath("//a[text()='What is FP?']")).getCssValue("background-color");
//	    System.out.println("FIPGTS_00005_TextColore : " + textColor );
//	    System.out.println("FIPGTS_00005_Highlighted  Color : " + bkgColor);
	Thread.sleep(2000);
	String color = driver.findElement(By.xpath("//a[text()='What is FP?']")).getCssValue("color");

	String backcolor = driver.findElement(By.xpath("//a[text()='What is FP?']")).getCssValue("background-color");

	System.out.println(color);

	System.out.println(backcolor);

	if(!color.equals(backcolor)){

	System.out.println("Text is highlighted!");

	}

	else{

	System.out.println("Text is not highlighted!");
	}
}

//pagescroling
@Test(priority=6,enabled=true)
public void FIPGTS_00001_FIPGTS_00006() throws InterruptedException {
	 
//	JavascriptExecutor executor = (JavascriptExecutor) driver;
//	JavascriptExecutor executor1 = (JavascriptExecutor) driver;
//	Long value = (Long) executor1.executeScript("return document.getElementById('container').scrollTop;");
//	
//	JavascriptExecutor executor = (JavascriptExecutor) driver;
//	WebElement Js=driver.findElement(By.xpath("//input[@class='search_input']"));	
//	executor.executeScript("arguement[0].scrollIntoView(true)", Js);
	
		
	Actions action = new Actions(driver);
	action.moveByOffset(200,100).perform();
	Thread.sleep(10000);
	action.click();
}
@Test(priority=7,enabled=true)
public void FIPGTS_00001_FIPGTS_00007() throws InterruptedException {

	Actions act=new Actions(driver);
	WebElement Knowmore = driver.findElement(By.xpath("//a[text()='Know More']"));
	act.moveToElement(Knowmore).perform();
	Thread.sleep(2000);
	
	Actions action = new Actions(driver);
	action.moveByOffset(200,100).perform();
	Thread.sleep(2000);
	action.click();
}
@Test(priority=8,enabled=true)
public void FIPGTS_00001_FIPGTS_00008() throws InterruptedException {



	Actions act=new Actions(driver);
	WebElement Signinlogin = driver.findElement(By.xpath("//button[text()='SignUp/LogIn']"));
	act.moveToElement(Signinlogin).perform();
	Thread.sleep(2000);
	Actions actions = new Actions(driver);
	actions.moveToElement(driver.findElement(By.tagName("body")), 0, 0);
	actions.moveByOffset(4, 3).click().build().perform();
	Boolean Display2 = driver.findElement(By.xpath("//a[contains(text(),'RStar SignUp/Login')]")).isEnabled();
	System.out.println("FIPGTS_00008 Signinlogin optionElement not is enabled  :"+Display2);


}
@Test(priority=10,enabled=true)

	public void FIPGTS_00002_FIPGTS_00001() throws InterruptedException {
		Actions act=new Actions(driver);
		WebElement knowmore = driver.findElement(By.xpath("//a[contains(text(),'Know More')]"));
		act.moveToElement(knowmore).perform();
		
		WebElement WhatsFP= driver.findElement(By.xpath("//a[contains(text(),'What is FP?')]"));
		act.moveToElement(WhatsFP).perform();
		
		//KnowMore options
		String color = driver.findElement(By.xpath("//a[contains(text(),'What is FP?')]")).getCssValue("color");

		String backcolor = driver.findElement(By.xpath("//a[contains(text(),'What is FP?')]")).getCssValue("background-color");

		System.out.println(color);

		System.out.println(backcolor);

		if(!color.equals(backcolor)){

		System.out.println("FIPGTS_00002_FIPGTS_00001-Text is highlighted!");
		Actions action = new Actions(driver);
		action.moveByOffset(200,100).perform();
		Thread.sleep(2000);
		action.click();

		}
		}

@Test(priority=11,enabled=true)
public void FIPGTS_00002_FIPGTS_00002() throws InterruptedException {
	Actions act=new Actions(driver);
	WebElement knowmore = driver.findElement(By.xpath("//a[contains(text(),'Know More')]"));
	act.moveToElement(knowmore).perform();
	
	WebElement Detailedinstruction= driver.findElement(By.xpath("//a[contains(text(),'Detailed Instructions')]"));
	act.moveToElement(Detailedinstruction).perform();
	
	//KnowMore options
	String color = driver.findElement(By.xpath("//a[contains(text(),'Detailed Instructions')]")).getCssValue("color");

	String backcolor = driver.findElement(By.xpath("//a[contains(text(),'Detailed Instructions')]")).getCssValue("background-color");

	System.out.println(color);

	System.out.println(backcolor);

	if(!color.equals(backcolor)){

	System.out.println("FIPGTS_00002_FIPGTS_00002-Text is highlighted!");
	Actions action = new Actions(driver);
	action.moveByOffset(200,100).perform();
	Thread.sleep(2000);
	action.click();

	}
	}

@Test(priority=12,enabled=true)
public void FIPGTS_00002_FIPGTS_00003() throws InterruptedException {
	Actions act=new Actions(driver);
	WebElement knowmore = driver.findElement(By.xpath("//a[contains(text(),'Know More')]"));
	act.moveToElement(knowmore).perform();
	
	WebElement videos= driver.findElement(By.xpath("//a[contains(text(),'Videos')]"));
	act.moveToElement(videos).perform();
	
	//KnowMore options
	String color = driver.findElement(By.xpath("//a[contains(text(),'Videos')]")).getCssValue("color");

	String backcolor = driver.findElement(By.xpath("//a[contains(text(),'Videos')]")).getCssValue("background-color");

	System.out.println(color);

	
	System.out.println(backcolor);

	if(!color.equals(backcolor)){

	System.out.println("FIPGTS_00002_FIPGTS_00003-Text is highlighted!");
	Actions action = new Actions(driver);
	action.moveByOffset(200,100).perform();
	Thread.sleep(2000);
	action.click();
	}
}

@Test(priority=13,enabled=true)
public void FIPGTS_00002_FIPGTS_00004() throws InterruptedException {
	Actions act=new Actions(driver);
	WebElement knowmore = driver.findElement(By.xpath("//a[contains(text(),'Know More')]"));
	act.moveToElement(knowmore).perform();
	
	WebElement BecomeAnRstar= driver.findElement(By.xpath("//a[contains(text(),'Become an RStar')]"));
	act.moveToElement(BecomeAnRstar).perform();
	
	//KnowMore options
	String color = driver.findElement(By.xpath("//a[contains(text(),'Become an RStar')]")).getCssValue("color");

	String backcolor = driver.findElement(By.xpath("//a[contains(text(),'Become an RStar')]")).getCssValue("background-color");

	System.out.println(color);

	
	System.out.println(backcolor);

	if(!color.equals(backcolor)){

	System.out.println("FIPGTS_00002_FIPGTS_00004-Text is highlighted!");
	Actions action = new Actions(driver);
	action.moveByOffset(200,100).perform();
	Thread.sleep(2000);
	action.click();
	}
}

@Test(priority=14,enabled=true)
public void FIPGTS_00002_FIPGTS_00005() throws InterruptedException {
	Actions act=new Actions(driver);
	WebElement knowmore = driver.findElement(By.xpath("//a[contains(text(),'Know More')]"));
	act.moveToElement(knowmore).perform();
	
	WebElement TOS= driver.findElement(By.xpath("//a[contains(text(),'TOS/Privacy Policy')]"));
	act.moveToElement(TOS).perform();
	
	//KnowMore options
	String color = driver.findElement(By.xpath("//a[contains(text(),'TOS/Privacy Policy')]")).getCssValue("color");

	String backcolor = driver.findElement(By.xpath("//a[contains(text(),'TOS/Privacy Policy')]")).getCssValue("background-color");

	System.out.println(color);

	
	System.out.println(backcolor);

	if(!color.equals(backcolor)){

	System.out.println("FIPGTS_00002_FIPGTS_00005-Text is highlighted!");
	Actions action = new Actions(driver);
	action.moveByOffset(200,100).perform();
	Thread.sleep(2000);
	action.click();
	}
}
@Test(priority=15,enabled=true)
public void FIPGTS_00002_FIPGTS_00006() throws InterruptedException {
	Actions act=new Actions(driver);
	WebElement knowmore = driver.findElement(By.xpath("//a[contains(text(),'Know More')]"));
	act.moveToElement(knowmore).perform();
	
	WebElement TOS= driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]"));
	act.moveToElement(TOS).perform();
	
	//KnowMore options
	String color = driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).getCssValue("color");

	String backcolor = driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).getCssValue("background-color");

	System.out.println(color);

	
	System.out.println(backcolor);

	if(!color.equals(backcolor)){

	System.out.println("FIPGTS_00002_FIPGTS_00006-Text is highlighted!");
	Actions action = new Actions(driver);
	action.moveByOffset(200,100).perform();
	Thread.sleep(2000);
	action.click();
	}
}


@Test(priority=16,enabled=true)
public void FIPGTS_00002_FIPGTS_00007() throws InterruptedException {
	
	String FIPGTS_00002_FIPGTS_00007FirstPageHome=driver.getWindowHandle();
	Actions act=new Actions(driver);
	WebElement FIPGTS_00002_FIPGTS_00007_contactusknowmore = driver.findElement(By.xpath("//a[contains(text(),'Know More')]"));
	act.moveToElement(FIPGTS_00002_FIPGTS_00007_contactusknowmore).perform();
	Thread.sleep(2000);
	String FIPGTS_00002_FIPGTS_00007homeur= driver.getCurrentUrl();
	
	WebElement FIPGTS_00002_FIPGTS_00007_knowmore= driver.findElement(By.xpath("//*[contains(text(),'What is FP?')]"));
	FIPGTS_00002_FIPGTS_00007_knowmore.click();
	Set<String>Allwindows=driver.getWindowHandles();
	for (String FIPGTS_00002_FIPGTS_00007_KnowMore1 : Allwindows) {
		driver.switchTo().window(FIPGTS_00002_FIPGTS_00007_KnowMore1);
		String FIPGTS_00002_FIPGTS_00007currentwindow=driver.getCurrentUrl();
	}
		if(driver.getCurrentUrl().equals("http://18.218.59.128/firstpage/public/Know_More#pitch")){
			System.out.println(" FIPGTS_00002_FIPGTS_00007= Pass");
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(FIPGTS_00002_FIPGTS_00007FirstPageHome);
		}
		else {
			
			System.out.println("FIPGTS_00002_FIPGTS_00007= Fails");
		}
		Actions action = new Actions(driver);
		action.moveByOffset(200,100).perform();
		Thread.sleep(2000);
		action.click();
		
}


			
@Test(priority=17,enabled=true)
public void FIPGTS_00002_FIPGTS_00008() throws InterruptedException {
	
	String FIPGTS_00002_FIPGTS_00008FirstPageHome=driver.getWindowHandle();
	Actions act=new Actions(driver);
	WebElement FIPGTS_00002_FIPGTS_00008_knowmore = driver.findElement(By.xpath("//a[contains(text(),'Know More')]"));
	act.moveToElement(FIPGTS_00002_FIPGTS_00008_knowmore).perform();
	Thread.sleep(2000);
	String FIPGTS_00002_FIPGTS_00008_homeurl= driver.getCurrentUrl();
								
	WebElement FIPGTS_00002_FIPGTS_00008Detailedinstruction= driver.findElement(By.xpath("//a[contains(text(),'Detailed Instructions')]"));
	FIPGTS_00002_FIPGTS_00008Detailedinstruction.click();
	Thread.sleep(2000);
	Set<String>Allwindows=driver.getWindowHandles();
	for (String FIPGTS_00002_FIPGTS_00008detailedinstruction : Allwindows) {
		driver.switchTo().window(FIPGTS_00002_FIPGTS_00008detailedinstruction);
		String FIPGTS_00002_FIPGTS_00008_currentwindow=driver.getCurrentUrl();
	}
		if(driver.getCurrentUrl().equals("http://18.218.59.128/firstpage/public/detailed_instructions")){
			System.out.println("FIPGTS_00002_FIPGTS_00008 = Pass");
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(FIPGTS_00002_FIPGTS_00008FirstPageHome);
		}
		else {
			
			System.out.println("FIPGTS_00002_FIPGTS_00008=  Fails");
		}
		
}
@Test(priority=18,enabled=true)
public void FIPGTS_00002_FIPGTS_00009() throws InterruptedException {
	
	String FIPGTS_00002_FIPGTS_00009FirstPageHome=driver.getWindowHandle();
	Actions act=new Actions(driver);
	WebElement FIPGTS_00002_FIPGTS_00009_knowmore = driver.findElement(By.xpath("//a[contains(text(),'Know More')]"));
	act.moveToElement(FIPGTS_00002_FIPGTS_00009_knowmore).perform();
	Thread.sleep(2000);
	String FIPGTS_00002_FIPGTS_00009_homeurl= driver.getCurrentUrl();
	
	WebElement FIPGTS_00002_FIPGTS_00009_contactus= driver.findElement(By.xpath("//*[contains(text(),'Videos')]"));
	FIPGTS_00002_FIPGTS_00009_contactus.click();
	Set<String>Allwindows=driver.getWindowHandles();
	for (String FIPGTS_00002_FIPGTS_00009_contactuscontactus1 : Allwindows) {
		driver.switchTo().window(FIPGTS_00002_FIPGTS_00009_contactuscontactus1);
		String FIPGTS_00002_FIPGTS_00009_currentwindow=driver.getCurrentUrl();
	}
		if(driver.getCurrentUrl().equals("http://18.218.59.128/firstpage/public/Know_More#videos")){
			System.out.println(" FIPGTS_00002_FIPGTS_00009 = Pass");
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(FIPGTS_00002_FIPGTS_00009FirstPageHome);
		}
		else {
			
			System.out.println(" FIPGTS_00002_FIPGTS_00009 = Fails");
		}
}
@Test(priority=19,enabled=true)
public void FIPGTS_00002_FIPGTS_000010() throws InterruptedException {
	
	String FIPGTS_00002_FIPGTS_000010_FirstPageHome=driver.getWindowHandle();
	Actions act=new Actions(driver);
	WebElement FIPGTS_00002_FIPGTS_000010_knowmore = driver.findElement(By.xpath("//a[contains(text(),'Know More')]"));
	act.moveToElement(FIPGTS_00002_FIPGTS_000010_knowmore).perform();
	Thread.sleep(2000);
	String FIPGTS_00002_FIPGTS_000010_homeurl= driver.getCurrentUrl();
	
	WebElement FIPGTS_00002_FIPGTS_000010_BecomeRstar= driver.findElement(By.xpath("//a[contains(text(),'Become an RStar')]"));
	FIPGTS_00002_FIPGTS_000010_BecomeRstar.click();
	Set<String>Allwindows=driver.getWindowHandles();
	for (String FIPGTS_00002_FIPGTS_000010_BecomeRstar1 : Allwindows) {
		driver.switchTo().window(FIPGTS_00002_FIPGTS_000010_BecomeRstar1);
		String currentwindow=driver.getCurrentUrl();
	}
		if(driver.getCurrentUrl().equals("http://18.218.59.128/firstpage/public/Know_More#become_a_rstar")){
			System.out.println("FIPGTS_00002_FIPGTS_000010= Pass");
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(FIPGTS_00002_FIPGTS_000010_FirstPageHome);
		}
		else {
			
			System.out.println("FIPGTS_00002_FIPGTS_000010= Fails");
		}
		
}
@Test(priority=20,enabled=true)
public void FIPGTS_00002_FIPGTS_000011() throws InterruptedException {
	
	String FIPGTS_00002_FIPGTS_000012_FirstPageHome=driver.getWindowHandle();
	Actions act=new Actions(driver);
	WebElement FIPGTS_00002_FIPGTS_000011_knowmore6 = driver.findElement(By.xpath("//a[contains(text(),'Know More')]"));
	act.moveToElement(FIPGTS_00002_FIPGTS_000011_knowmore6).perform();
	Thread.sleep(2000);
	String FIPGTS_00002_FIPGTS_000011_homeurl= driver.getCurrentUrl();
	
	WebElement FIPGTS_00002_FIPGTS_000011_TOS= driver.findElement(By.xpath("//a[contains(text(),'TOS/Privacy Policy')]"));
	FIPGTS_00002_FIPGTS_000011_TOS.click();
	Set<String>Allwindows=driver.getWindowHandles();
	for (String FIPGTS_00002_FIPGTS_000011_TOS1 : Allwindows) {
		driver.switchTo().window(FIPGTS_00002_FIPGTS_000011_TOS1);
		String currentwindow=driver.getCurrentUrl();
	}
		if(driver.getCurrentUrl().equals("http://18.218.59.128/firstpage/public/tos")){
			System.out.println("FIPGTS_00002_FIPGTS_000011_FirstPageHome = Pass");
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(FIPGTS_00002_FIPGTS_000012_FirstPageHome);
		}
		else {
			
			System.out.println("FIPGTS_00002_FIPGTS_000011_FirstPageHome = Fails");
		}
}
@Test(priority=21,enabled=true)

public void FIPGTS_00002_FIPGTS_000012() throws InterruptedException {
	
	String FIPGTS_00002_FIPGTS_000012FirstPageHome=driver.getWindowHandle();
	Actions act=new Actions(driver);
	WebElement FIPGTS_00002_FIPGTS_000012_knowmore = driver.findElement(By.xpath("//a[contains(text(),'Know More')]"));
	act.moveToElement(FIPGTS_00002_FIPGTS_000012_knowmore).perform();
	Thread.sleep(2000);
	String FIPGTS_00002_FIPGTS_000012_knowmore_homeurl= driver.getCurrentUrl();
	
	WebElement FIPGTS_00002_FIPGTS_000012_knowmore_Contactus= driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]"));
	FIPGTS_00002_FIPGTS_000012_knowmore_Contactus.click();
	Set<String>Allwindows=driver.getWindowHandles();
	for (String FIPGTS_00002_FIPGTS_000012_Contactus1 : Allwindows) {
		driver.switchTo().window(FIPGTS_00002_FIPGTS_000012_Contactus1);
		String FIPGTS_00002_FIPGTS_000012_currentwindow=driver.getCurrentUrl();
	}
		if(driver.getCurrentUrl().equals("http://18.218.59.128/firstpage/public/contact_us")){
			System.out.println("FIPGTS_00002_FIPGTS_000013 = Pass");
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(FIPGTS_00002_FIPGTS_000012FirstPageHome);
		}
		else {
			
		System.out.println("FIPGTS_00002_FIPGTS_000012 = Fails");
	}


}
@Test(priority=22,enabled=true)
public void FIPGTS_00003_FIPGTS_00001() throws InterruptedException {
	String FIPGTS_00003_FIPGTS_00001FirstPageHome=driver.getWindowHandle();
	Actions act=new Actions(driver);
	WebElement FIPGTS_00003_FIPGTS_00001_contactusknowmore = driver.findElement(By.xpath("//a[contains(text(),'Know More')]"));
	act.moveToElement(FIPGTS_00003_FIPGTS_00001_contactusknowmore).perform();
	Thread.sleep(2000);
	String FIPGTS_00002_FIPGTS_00007homeur= driver.getCurrentUrl();
	
	WebElement FIPGTS_00003_FIPGTS_00001_knowmore= driver.findElement(By.xpath("//*[contains(text(),'What is FP?')]"));
	FIPGTS_00003_FIPGTS_00001_knowmore.click();
	Set<String>Allwindows=driver.getWindowHandles();
	for (String FIPGTS_00003_FIPGTS_00001_KnowMore1 : Allwindows) {
		driver.switchTo().window(FIPGTS_00003_FIPGTS_00001_KnowMore1);
		String FIPGTS_00003_FIPGTS_00001currentwindow=driver.getCurrentUrl();
	}
	 String FIPGTS_00003_FIPGTS_00001text = "Your Competitors Eat Your Lunch at FirstPageit. Fight. Be There !!";
     // getPageSource() to get page source
     if ( driver.getPageSource().contains("Your Competitors Eat Your Lunch at ")){
        System.out.println("Text: " + FIPGTS_00003_FIPGTS_00001text + " is present. ");
     } else {
        System.out.println("Text: " + FIPGTS_00003_FIPGTS_00001text + " is not present. ");
     }
  }
	
	

@Test(priority=23,enabled=true)
public void FIPGTS_00003_FIPGTS_00002() throws InterruptedException {
	

	JavascriptExecutor jse = (JavascriptExecutor)driver;
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,250)");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);

	
	Thread.sleep(2000);
}
	@Test(priority=24,enabled=true)
	public void FIPGTS_00003_FIPGTS_00003() throws InterruptedException {
		WebElement FIPGTS_00003_FIPGTS_00003Firstpageit = driver.findElement(By.xpath("/html/body/nav/a/h4/img"));
		FIPGTS_00003_FIPGTS_00003Firstpageit.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
	}
	@Test(priority=25,enabled=true)
	public void FIPGTS_00003_FIPGTS_00004() throws InterruptedException {
		
		Actions act=new Actions(driver);
		WebElement FIPGTS_00003_FIPGTS_00004Knowmore = driver.findElement(By.xpath("//a[text()='Know More']"));
		act.moveToElement(FIPGTS_00003_FIPGTS_00004Knowmore).perform();
		//KnowMore options
		Thread.sleep(2000);
		Boolean Display1 = driver.findElement(By.xpath("//*[contains(text(),'What is FP?')]")).isDisplayed();
		System.out.println("FIPGTS_00003_FIPGTS_00004_Knowmore_WhatsFPOption_Element displayed is :"+Display1);
		//Detailed Instructions
		Boolean Display2 = driver.findElement(By.xpath("//*[contains(text(),'Detailed Instructions')]")).isDisplayed();
		System.out.println("FIPGTS_00003_FIPGTS_00004_Knowmore_DetailedInstructionOption_Element displayed is :"+Display2);
		
		//Become a Rstar
		Boolean Display3 = driver.findElement(By.xpath("//*[contains(text(),'Videos')]")).isDisplayed();
		System.out.println("FIPGTS_00003_FIPGTS_00004_Knowmore_Video_Option_Element displayed is :"+Display3);
		
	//BecomeRstar
		Boolean Display4 = driver.findElement(By.xpath("//a[contains(text(),'Become an RStar')]")).isDisplayed();
		System.out.println("FIPGTS_00003_FIPGTS_00004_Knowmore_BecomeAnRstar_Option_Element displayed is :"+Display4);
		
		//TOS
		Boolean Display5 = driver.findElement(By.xpath("//a[contains(text(),'TOS/Privacy Policy')]")).isDisplayed();
		System.out.println("FIPGTS_00003_FIPGTS_00004_Knowmore_TOS_Option_Element displayed is :"+Display5);
		
		
	//Contactus
		Boolean Display6 = driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).isDisplayed();
		System.out.println("FIPGTS_00003_FIPGTS_00004_Knowmore_Contactus_Option_Element displayed is :"+Display6);
		

//		Actions action = new Actions(driver);
//		action.moveByOffset(100,200).perform();
//		Thread.sleep(2000);
//		action.click();
//	
		
	      }
	@Test(priority=26,enabled=true)
	public boolean FIPGTS_00003_FIPGTS_00005() throws InterruptedException {

		Actions act=new Actions(driver);
		WebElement Knowmore = driver.findElement(By.xpath("//a[text()='Know More']"));
		act.moveToElement(Knowmore).perform();
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.moveByOffset(200,100).perform();
		Thread.sleep(2000);
		action.click();
	
		
		
		    try {
		        driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]"));
		        Thread.sleep(2000);
		        System.out.println("Element Present");
		        return false ;

		    } catch (NoSuchElementException e) {
		    	Thread.sleep(2000);
		        System.out.println("Element absent");
		        return true ;
		    }
		
	}
	@Test(priority=27,enabled=true)
	public void FIPGTS_00003_FIPGTS_00006() throws InterruptedException {
		
//		driver.get("http://18.218.59.128/firstpage/public/Know_More#pitch");
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
		Assert.assertEquals(store, 2);
		
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
//		Set<String>Allwindows=driver.getWindowHandles();
//		for (String FIPGTS_00003_FIPGTS_00009_BecomeRstar1 : Allwindows) {
//			driver.switchTo().window(FIPGTS_00003_FIPGTS_00009_BecomeRstar1);
//			
//		}
		String currentwindow=driver.getCurrentUrl();
			if(driver.getCurrentUrl().equals("http://18.218.59.128/firstpage/public/Know_More#become_a_rstar")){
				System.out.println("FIPGTS_00003_FIPGTS_00009= Pass");
				Thread.sleep(2000);
//				driver.close();
//				driver.switchTo().window(FIPGTS_00003_FIPGTS_00009_FirstPageHome);
			}
			else {
				
				System.out.println("FIPGTS_00003_FIPGTS_00009= Fails");

				Actions action = new Actions(driver);
				action.moveByOffset(200,100).perform();
				Thread.sleep(2000);
				action.click();
			}
	}
				

	@AfterSuite
	public void Close_Browser() {

		driver.close();
}
}




