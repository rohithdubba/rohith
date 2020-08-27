package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class Homepage extends TestBase {
	
	@FindBy(xpath= "//a[contains(@href,'/calendar')]")
	WebElement calendar;
	
	@FindBy(xpath="//a[contains(@href,'/contacts')]")
	WebElement contacts;
	
	@FindBy(xpath="//a[contains(@href,'/companies')]")
	WebElement companies;
	
	public Homepage() throws IOException
	{
		PageFactory.initElements(driver,this);
		//System.out.println("construcator called");
	}
	
	
	public CalenderPage Homepagecalendar() throws IOException
	{
		calendar.click();
	return new CalenderPage();
	}
	
	public ContactPage Homepagecontact() throws IOException
	{
		contacts.click();
	return new ContactPage();
	}
	
	
	public CompanyPage Homepagecompanies() throws IOException
	{
		companies.click();
	return new CompanyPage();
	}
	
	
	
}
