package Library_File;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Base_Class 
{
	public WebDriver driver;
	
	public void initilizeBrowser() throws InterruptedException 
	{
	     
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya Ingole\\eclipse-workspace\\12thFebCMorningBatch_Selenium_Maven\\Browser\\chromedriver.exe");
		   
		   // create object of chromedriver provide reference of webdriver
		
		WebDriverManager.chromedriver().setup();

		
		    driver=new  ChromeDriver();
		     
		     //put url using get method
		     
	   driver.get("https://kite.zerodha.com/");
	   
	   Thread.sleep(3000);
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
