package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class ContactPage extends TestBase{
	
	@FindBy(xpath="//a[@href='/contacts/new']/button[contains(@class,'ui linkedin button')]")
	WebElement newbtn;
	
	@FindBy(xpath="//input[contains(@name,'first_name')]")
	WebElement firstnamebtn;

	@FindBy(xpath="//input[contains(@name,'last_name')]")
	WebElement lastnamebtn;

	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement emailbtn;

	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	
	
	public ContactPage()throws IOException 
	{
		PageFactory.initElements(driver,this);
		System.out.println("contactpage constructor called");
	}
	
	public ContactDetailPage Contactpagemethod(String ftname,String ltname,String emailid) throws IOException {
	
		newbtn.click();
		firstnamebtn.sendKeys(ftname);
		lastnamebtn.sendKeys(ltname);
		emailbtn.sendKeys(emailid);
		save.click();
    return new ContactDetailPage();
	}
	
	}
	
	
	
	
	
	
	


