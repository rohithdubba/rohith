package com.qa.Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	public boolean retry(ITestResult arg0) 
	{
	  int retrycount =0;
	final int Maxretrycount=2;
	  if(retrycount < Maxretrycount)
	  {
		  retrycount++;
		  return true;
	  }
		// TODO Auto-generated method stub
		return false;
	}

}
