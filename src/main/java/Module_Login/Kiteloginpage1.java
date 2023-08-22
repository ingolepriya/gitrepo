package Module_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage1 
{
	//POM Class 1
	
		//step 1- Data member/variable should be declared globally with accesss level private by using @findBy annotation
		
		     @FindBy(xpath="//input[@id='userid']")  private WebElement UN;  //WebElement UN = driver.findElement(By.xpath("//input[@type='text']"));
		
		     @FindBy(xpath="//input[@id='password']")  private WebElement PSW;//WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		
		     @FindBy(xpath="//button[@type='submit']")  private WebElement Loginbutton;//WebElement Loginbutton =driver.findElement(By.xpath("//button[@type='submit']"));
		 	
		//step 2-Initialize within a constructor with access level public using pagefactory class
		     
		      public Kiteloginpage1( WebDriver driver )
		     {
		    	 
		    	 PageFactory.initElements(driver, this);
		    	 
		    	 
		     }
		      
		 //step 3- Utilize within a method with access level public   
		      
		      public void enterUserID(String UserID) 
		      {
		    	  
		    	  UN.sendKeys(UserID);
		    	  
		    	  
		      }
		      public void enterpsw(String Password) 
		      {
		    	  
		    	 
		    	 PSW.sendKeys(Password); 
		    	  
		      }
		      public void clickloginbtn() 
		      {
		    	  
		    	  Loginbutton.click(); 
		    	  
		    	  
		      }
		     
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
