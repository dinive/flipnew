package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customerdetails {
	
	WebDriver ldriver;

	public Customerdetails(WebDriver rdriver)
	{
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/ul[1]/li[2]/a[1]")
	@CacheLookup
	WebElement txtnewcustomername;

	@FindBy(name="name")
	@CacheLookup
	WebElement txtcustomername;
	
	
	
	public void txtnewcustomername() {
	txtnewcustomername.click();
	}
	public void txtcustomername(String dinive) {
		txtcustomername.sendKeys(dinive);
}


}