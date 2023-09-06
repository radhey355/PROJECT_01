package com.rsp.pribate_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.grid.config.DescribedOption;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DROPDOWN {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
         WebDriver driver= new ChromeDriver();
		
	    driver.get("https://www.google.com/");
     	System.out.println(driver.getTitle());
     	driver.manage().window().maximize();
     	
       //DROPDOENS
     	WebElement dropdown  = driver.findElement(By.xpath(""));
        Select drop = new Select(dropdown);
        drop.selectByIndex(0);
        drop.selectByValue("");
        drop.selectByVisibleText("INDIA");
		
		
	}

}
