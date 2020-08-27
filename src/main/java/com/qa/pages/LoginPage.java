package com.qa.pages;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {
	//ContactPage contact;
	@FindBy(xpath="//input[@name='email']")
	WebElement Emailid;
	@FindBy(xpath="//input[@type='passwo']")
	WebElement Password;
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement lgbtn;
	
	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver,this);
		//System.out.println("construcator called");
	}
	public Homepage loginpagemethod(String un,String pw) throws IOException
	{
		//System.out.println("loginmethod called");
		//Emailid.sendKeys("rohithr76@gmail.com");
		//System.out.println("email called");
		//Password.sendKeys("Pranitha@123$");
	//	System.out.println("password called");
		
		Emailid.sendKeys(un);
		Password.sendKeys(pw);
		lgbtn.click();		
		//System.out.println("The tite of page is "+"  "+driver.getTitle());
	
	return new Homepage();
	}
	
	
}
