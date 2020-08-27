package com.qa.testcases;

import java.io.IOException;
import java.util.Objects;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.Constants;
import com.qa.base.TestBase;
import com.qa.pages.ContactPage;
import com.qa.pages.Homepage;
import com.qa.pages.LoginPage;
import com.qa.testutil.TestUtil;

public class ContactPageTest extends TestBase{
	LoginPage login1;
	 Homepage home1;
	 ContactPage cp;
	 String sheetName="contact";
	;
	/*public ContactPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}*/

	 @BeforeMethod
	 public void initialization() throws Exception {
			Boolean flag=TestUtil.istestrunnable(reader, "ContactPageTest");
			if(flag==false)
			{
			throw new SkipException("test case is skipped as runmode is N");
			}
		init();
		login1 =new LoginPage(); 
		home1=login1.loginpagemethod(Constants.Emailid, Constants.password);	
		home1.Homepagecontact();
	 }
	/* 
	 @DataProvider
	 public Object[][] getcontactData() {
		 
	Object data[][] =TestUtil.getTestData(sheetName);
		return data; 
	 } */ 
	 
	@Test(dataProvider="getcontactData")
	public void contactpagetest(String firstname,String lastname,String emailid) throws IOException 
	{
	
		cp=new ContactPage();
		System.out.println("contact method is called");
	    cp.Contactpagemethod(firstname,lastname,emailid);	
		TestUtil.capturescreenshot();
	}
	
	@AfterMethod
	public void teradown()
	{
		driver.quit();
	}
	
	
}
