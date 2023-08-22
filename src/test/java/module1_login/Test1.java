package module1_login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 


{
    public static void main(String[] args) throws InterruptedException 
    {
    	//Step 1: set the path of chromedriver.exe.file
	    //step 2: Name of the browser
		//Parameter -2: path of chromedriver.exe.file
		
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya Ingole\\eclipse-workspace\\12thFebCMorningBatch_Selenium_Maven\\Browser\\chromedriver.exe");
    	
    	WebDriverManager.chromedriver().setup();
    	//create object of chromedriver provide reference of webdriver
    	
    	WebDriver  driver=new  ChromeDriver();
    	
    	//put url using get method
    	
    	driver.get("http://demo.automationtesting.in/Frames.html");
    	
    	//timer
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	//step-1  identify dropdown and store into an object
    	
    	WebElement Dropdown = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
    	
    	//create object of Actions
    	
    	Actions  act=new  Actions(driver);
    	
    	//To move curser
    	
    	act.moveToElement(Dropdown).perform();
    	
    	//to click windows option
    	
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("//a[text()='Windows']")).click();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
