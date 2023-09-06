package com.rsp.pribate_page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jbktest.com/"); 
		
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		driver.switchTo().frame("webform");
		
	//System.out.println(driver.findElement(By.id("webform_c_eeple")).getText());
	
	driver.findElement(By.xpath("//input[@class='placeholder padding']")).sendKeys("saran35515@gmail.com");
	
	driver.findElement(By.xpath("//button[@class='button border']/span")).click();
		
	}

}
