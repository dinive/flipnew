package com.inetbanking.testcases;

import org.testng.annotations.Test;

import com.inetbanking.pageobjects.Customerdetails;
import com.inetbanking.pageobjects.Pageobject;

public class TC_Customerdetails_003  extends Baseclass{

	@Test
	public void custdetails() throws InterruptedException {
		Pageobject lp=new Pageobject(driver);
		lp.setusername(username);
		logger.info("entered usrnme");
		lp.setpassword(password);
		logger.info("entered password");
		lp.clicksubmit();
		
		Thread.sleep(3000);
	Customerdetails custdet=new Customerdetails(driver);
	custdet.txtnewcustomername();
	custdet.txtcustomername("dinive");
	Thread.sleep(5000);
}
}