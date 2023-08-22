package module1_login;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_File.Base_Class;
import Module_Login.KiteHomePage;
import Module_Login.Kiteloginpage1;
import Module_Login.Kiteloginpage2;
import Module_Login.UtilityClass;



public class KiteLoginTestClass extends Base_Class 
{
	Kiteloginpage1 login1;
	Kiteloginpage2 login2;
	KiteHomePage   Home;
	int TestCaseID;
	@BeforeClass
	public void OpenBrowser() throws InterruptedException  
	{
		//open browser
		initilizeBrowser(); 
		
	    //create object of POM class 1
	   
	    login1=new  Kiteloginpage1(driver);
	    
	    //create object of POM class 2
	       
	    login2=new Kiteloginpage2(driver);

	  //create object of POM class3
	       
	    Home=new  KiteHomePage(driver); 
	    	   
	}
	
	@BeforeMethod
	public void LoginToApp() throws IOException 
	{
		
		//enter UN
		login1.enterUserID(UtilityClass.getDataFromPF("UN"));
		
		//enter psw
		login1.enterpsw(UtilityClass.getDataFromPF("PSW"));
		
		//click login button
		login1.clickloginbtn();
		
		
		//Enter pin
		
		login2.enterPIN(UtilityClass.getDataFromPF("PIN"));
		
		
		//click continue
		
		login2.clickctnbtn();
	
	} 
	 
	@Test
	public void verifyuserID() throws EncryptedDocumentException, IOException, InvalidFormatException
	{
		
		String ActualUserID=Home.getkiteHomepageUserID();
		
		String ExpectedUserID=UtilityClass.getTD(0, 0);
		
		Assert.assertEquals(ActualUserID, ExpectedUserID,"failed: Both are different");
		
	}
	@AfterMethod
	public void logoutFromApplication(ITestResult Result) throws IOException 
	{
		if(Result.getStatus()==ITestResult.FAILURE) 
		{
			
			UtilityClass.Screenshot(driver);
		} 
		Home.clickuserID();
		Home.clicklogoutbtn();
	}
	@AfterClass
	public void CloseBrowser() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.close();
	}
		
		
		
		
		
		
		
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
