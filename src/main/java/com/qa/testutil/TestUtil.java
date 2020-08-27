package com.qa.testutil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.base.TestBase;

public class TestUtil extends TestBase {
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	public static String screenshotName;
	public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String TESTDATA_SHEET_PATH = "/Users/user/eclipse_oxy_workspace/mounica workspace"
			+"/freecrm_project/src/main/java/com/qa/Testdata/mounicapractice.xlsx";

	static Workbook book;
	static Sheet sheet;
	static JavascriptExecutor js;

	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}

//	public static Object[][] getTestData(String sheetName) {
//		FileInputStream file = null;
//		try {
//			file = new FileInputStream(TESTDATA_SHEET_PATH);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		try {
//			book = WorkbookFactory.create(file);
//		} catch (InvalidFormatException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		sheet = book.getSheet(sheetName);
//		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
//		// System.out.println(sheet.getLastRowNum() + "--------" +
//		// sheet.getRow(0).getLastCellNum());
//		for (int i = 0; i < sheet.getLastRowNum(); i++) {
//			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
//				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
//				// System.out.println(data[i][k]);
//			}
//		}
//		return data;
//	}
	
	
	
	
	
	
public static String capturescreenshot() throws IOException {
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Date d = new Date();
	screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
	FileUtils.copyFile(src,new File(System.getProperty("user.dir") +"\\target\\"+ screenshotName));
	return System.getProperty("user.dir") +"\\target\\"+ screenshotName;
}

public static boolean istestrunnable(ExcelReader reader,String Testcase)
{
	int rows =reader.getRowCount("TestSuite");
	for(int i=2;i<=rows;i++)
	{
		if(reader.getCellData("TestSuite", "TC_id", i).equalsIgnoreCase(Testcase))
		{
			if(reader.getCellData("TestSuite", "Runmode", i).equalsIgnoreCase("Y"))
			{
				return true;
		
			}
			else
			{
				return false;
			}
			
		}
		
	}
	
return false;

}
}

