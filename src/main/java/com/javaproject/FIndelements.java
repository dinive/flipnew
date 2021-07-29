package com.javaproject;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FIndelements {
	
	public static org.apache.log4j.Logger logger;

	
	
	@Test
	public void findelements() {
	
		logger =org.apache.log4j.Logger.getLogger("findelements");
		PropertyConfigurator.configure("Log4j.properties");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.guru99.com/");
		List<WebElement> objnew=driver.findElements(By.tagName("a"));
		for (WebElement objCurrent : objnew) {
		String	Stringlinktxt=objCurrent.getText();
		
			 System.out.println(Stringlinktxt);
			 
		
			}
		
			
		driver.close();
		logger.info("logged in and exited success");


}}
