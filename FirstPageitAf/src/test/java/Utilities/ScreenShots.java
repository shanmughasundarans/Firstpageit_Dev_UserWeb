package Utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import HomePage.Homepage;

public class ScreenShots  extends BaseClass implements ITestListener {
	

public static void Screenshots(String File) throws IOException {
		
		String date =null;
		if(date==null) {
		 LocalDateTime myDateObj = LocalDateTime.now();
		    //System.out.println("Before formatting: " + myDateObj);
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");

		    String date1 = myDateObj.format(myFormatObj);
		   // System.out.println("After formatting: " + formattedDate);
		   
		
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File("./screenshots/"+date1+"/"+File);
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}
}
		
		public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub

		try {
			Screenshots(result.getMethod().getMethodName()+".jpg");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	

}
