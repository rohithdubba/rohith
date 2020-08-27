package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Homepage;
import com.qa.pages.LoginPage;

public class Homepagetest extends TestBase {
	LoginPage login;
	 Homepage home;

	public Homepagetest() throws IOException 
	{
		super();
	}
	
	@BeforeMethod
	 public void initialization() throws IOException {
		 init();
	 login=new LoginPage(); 
	 home=login.loginpagemethod(prop.getProperty("Emailid"), prop.getProperty("password"));
		 
	 }

	@Test(priority=1)
	public void Homeptestcalender() throws IOException {
		home.Homepagecalendar();		
	}

	
	@Test(priority=2)
	public void Homeptestcompany() throws IOException {
		home.Homepagecompanies();		
	}
	
	@Test(priority=3)
	public void Homeptestcontact() throws IOException {
		home.Homepagecontact();		
	}

	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
		
	}




}
