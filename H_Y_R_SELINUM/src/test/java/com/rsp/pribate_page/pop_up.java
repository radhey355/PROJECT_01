package com.rsp.pribate_page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pop_up {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.switchTo().alert().accept();
	}

}
