package com.qa.testcases;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Constants;
import com.qa.base.TestBase;
import com.qa.pages.ContactPage;
import com.qa.pages.Homepage;
import com.qa.pages.LoginPage;
import com.qa.testutil.TestUtil;
//monu
public class LoginTestcase extends TestBase {
	 LoginPage  obj;
	 Homepage home;
 
	public  LoginTestcase() throws IOException 
	{
		super();
	}
	
	@BeforeMethod
	 public void initialization() throws Exception {
		Boolean flag= TestUtil.istestrunnable(reader, "LoginTestcase");
		if(flag==false)
		{
		throw new SkipException("test case is skipped as runmode is N");
		} 
		
		init();
		 try {
			obj=new LoginPage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	 }
	 
 @Test
	public void loginpagetest() throws Exception
	{
	
  home=obj.loginpagemethod(Constants.Emailid, Constants.password);	
		
	}
	
	
	
}
