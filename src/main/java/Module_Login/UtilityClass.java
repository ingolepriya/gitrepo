package Module_Login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	
	public static String getDataFromPF(String Key) throws IOException 
	{
		
		//create object of file input stream class and pass of the property file
		
		FileInputStream   file=new  FileInputStream("C:\\Users\\Priya Ingole\\eclipse-workspace\\12thFebCMorningBatch_Selenium_Maven\\prop.properties");
		
		//create object of properties class
		
		Properties prop=new Properties();
		
		//to open property file
		prop.load(file);
		
		//To fetch data from property file
		String value=prop.getProperty(Key);
		
		return  value;//GP8097
	}
	
	public static String getTD(int RowIndex , int cellindex) throws EncryptedDocumentException, IOException, InvalidFormatException 
	{
	    //To rech upto excel sheet	
		FileInputStream   file=new  FileInputStream("C:\\Users\\Priya Ingole\\eclipse-workspace\\12thFebCMorningBatch_Selenium_Maven\\ExcelSheet\\New Microsoft Excel Worksheet.xlsx");
		
		//To open excelsheet
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet9");
		
		String  value2=sh.getRow(RowIndex).getCell(cellindex).getStringCellValue();
		
		return value2;
		
	}	
		
		//To capture Screenshot 
		
		public static void Screenshot(WebDriver driver) throws IOException 
		{
		  File Source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  File Destination=new File("C:\\Users\\Priya Ingole\\eclipse-workspace\\12thFebCMorningBatch_Selenium_Maven\\Screenshot");
		   
		  FileHandler.copy(Source, Destination);
			
		}
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
