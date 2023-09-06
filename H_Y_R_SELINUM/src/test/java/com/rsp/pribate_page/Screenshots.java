package com.rsp.pribate_page;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {

public static void main(String[] args) throws Exception {
	 
	WebDriverManager.chromiumdriver().setup();
	WebDriver driver = new ChromeDriver();
	System.out.println("facebook");
	driver.get("https://www.facebook.com/");

	Thread.sleep(3000);
 
	TakesScreenshot screen = (TakesScreenshot) driver;
	File file= screen.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("C:\\Users\\HP\\OneDrive\\Desktop\\getcreen\\facebook2.png"));
	
	System.out.println("sucessfull......");
	
	driver.quit();
	
}


	

}
