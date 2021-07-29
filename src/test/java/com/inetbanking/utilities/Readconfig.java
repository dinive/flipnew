package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	 Properties pro;
	
	public Readconfig() {
		
		File src=new File("./configuration/config.properties");
		try{
			FileInputStream fis=new FileInputStream(src);

		pro=new Properties();
		pro.load(fis);
		}catch (Exception e) {
			System.out.println("Exception is"+ e.getMessage());
	
		}}
	
	public String getappurl() 
	
	{
		String url=pro.getProperty("baseurl");
		return url;
	}
	
	public String username()
	
	{
		String username=pro.getProperty("username");
				return username;
	}
	
	public String password()
	{
		String password=pro.getProperty("password");
		return password;
	}
	
	public String chromepath()
	{
		String chromepath=pro.getProperty("chromepath");
				return chromepath;
	}
	
	public String getfire()
	{
		String firepath=pro.getProperty("firepath");
				return firepath;
	}
	
	public String ie()
	{
		String ie=pro.getProperty("ie");
				return ie;
	}
	
}
