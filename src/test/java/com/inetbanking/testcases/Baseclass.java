package com.inetbanking.testcases;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.inetbanking.utilities.Readconfig;

public class Baseclass {

	Readconfig read=new Readconfig();
	public String baseurl=read.getappurl();
	public String username=read.username();
	public String password=read.password();
	public static WebDriver driver;
	
	public static org.apache.log4j.Logger logger;
	@Parameters("br")
    @BeforeClass
	public void setup(String br)
	{
	logger =org.apache.log4j.Logger.getLogger("ebanking");
	PropertyConfigurator.configure("Log4j.properties");
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",read.chromepath());
	driver=new ChromeDriver();
		}
		else if (br.equals("fire"))
		{
			System.setProperty("webdriver.gecko.driver", read.getfire());
			driver=new FirefoxDriver();
		}
		else if (br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", read.ie());
			driver=new InternetExplorerDriver();
		}
	
		driver.get(baseurl);
		}


	@AfterClass
	public void teardown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source,target);
		System.out.println("screenshot taken");
	}
	}

	
	
