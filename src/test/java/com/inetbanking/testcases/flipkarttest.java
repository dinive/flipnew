package com.inetbanking.testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.flipkartpagedata;
import com.inetbanking.utilities.Readconfig;

public class flipkarttest {
	
	
	public static org.apache.log4j.Logger logger;
	
	@Test
      void flipkart() throws Exception
{
	
		Readconfig read=new Readconfig();
		System.setProperty("webdriver.chrome.driver",read.chromepath());
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		logger =org.apache.log4j.Logger.getLogger("flipkart test");
		PropertyConfigurator.configure("Log4j.properties");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	flipkartpagedata gg=new flipkartpagedata(driver);
	gg.searchelem("iphone");
	logger.info("ipone");
	
	gg.searchbox();
	logger.info("searchbox");
	gg.ramfilter();
	logger.info("filter");
	gg.phoneselect();
	logger.info("phoneselect");
	Set<String> windowsid = driver.getWindowHandles();
	Iterator<String> itr = windowsid.iterator();
	String parentid = itr.next();
	String childid = itr.next();
	driver.switchTo().window(childid);
	gg.phonebuy();
	logger.info("goes to payment page");
}
}