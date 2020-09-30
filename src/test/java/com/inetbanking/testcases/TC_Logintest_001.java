package com.inetbanking.testcases;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.Pageobject;
import com.inetbanking.utilities.Readconfig;

public class TC_Logintest_001 extends Baseclass  {
	

	@Test()
	public void logintest() throws IOException
	{
		
		
		Pageobject lp=new Pageobject(driver);
		lp.setusername(username);
		logger.info("entered usrnme");
		lp.setpassword(password);
		logger.info("entered password");
		lp.clicksubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
		Assert.assertTrue(true);
		logger.info("loggin passed");
	}
else {

	captureScreen(driver,"logintest");
	Assert.assertTrue(false);
	logger.info("login othified");
}
	}
	}
		
		
		
	