package com.inetbanking.testcases;


import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.Pageobject;
import com.inetbanking.utilities.xlutils;

public class TC_LoginDDT_002 extends Baseclass

{
	@Test(dataProvider = "Logindata")

	public void loginDDT(String uer,String pwd) throws Exception
	{
		Pageobject lp=new Pageobject(driver);
		lp.setusername(uer);
		logger.info("usr name given");
		lp.setpassword(pwd);
		logger.info("pwd name given");
		lp.clicksubmit();
		
		Thread.sleep(3000);
		
		if(isAlertpresent()==true)
		{
			Assert.assertTrue(false);
			logger.warn("login failed");
			driver.switchTo().alert().accept(); //close alert
			driver.switchTo().defaultContent();
			
		}
		
		else
		{
			Assert.assertTrue(true);
			logger.info("login passed");
			lp.clicklogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
	}
	
	public boolean isAlertpresent()
	{
		try
		{
			driver.switchTo().alert();
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@DataProvider(name="Logindata")
   private String [][] getData() throws IOException
   {
    String path=System.getProperty("user.dir")+"\\src\\test\\java\\com\\inetbanking\\testdata\\Logindata.xlsx";

    int rownum=xlutils.getRowCount(path, "sheet1");
    int colcount=xlutils.getCellCount(path, "sheet1", 1);
    
    String logindata[][]=new String[rownum][colcount];
    
    for (int i=1;i<=rownum;i++)
    {
    	for(int j=0;j<colcount;j++)
    	{
    		logindata[i-1][j]=xlutils.getCellData(path, "Sheet1", i, j);//1 0
    	}
    }
	return logindata;}}
   

