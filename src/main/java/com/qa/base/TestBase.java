package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.testutil.ExcelReader;
import com.qa.testutil.ExtentManager;
import com.qa.testutil.TestUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestBase {
public  static WebDriver driver;
public static Properties prop;
public static ExtentTest test;
public static ExtentReports rep=ExtentManager.getinstance();
public static ExcelReader reader = new ExcelReader(
		System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\Testdata\\mounicapractice.xlsx");

/* public TestBase() throws IOException
{
    prop=new Properties();
try {
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/qa/config/config.properties");
    prop.load(fis);
}catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
}
*/
public static void init()
{
//String browsername	= prop.getProperty("browser");
	String browsername	=Constants.browser;
//System.out.println(browsername);
//String url = prop.getProperty("url");
//System.out.println(url);
//C:/Users/user/eclipse_oxy_workspace/mounica workspace/freecrm_project
if(browsername.equals("chrome"))
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	driver=new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);	
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	driver.get(Constants.url);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();	
}	

}

}

