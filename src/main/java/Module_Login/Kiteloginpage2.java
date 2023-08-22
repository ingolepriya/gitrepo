package Module_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage2 
{
	
	  //POM Class 2
	
			//step 1-Data member/variable should be declared globally with accesss level private by using @findBy annotation
			
			     @FindBy(xpath="//input[@placeholder='PIN']")  private WebElement PIN;
			
			     @FindBy(xpath="//button[@type='submit']")  private WebElement ctnbtn;
			
			   //step 2-Initialize within a constructor with access level public using pagefactory class
			     
			      public Kiteloginpage2 (WebDriver driver)
			     {
			    	 
			    	 PageFactory.initElements(driver, this);
			    	 
			    	 
			     }
			    //step 3- Utilize within a method with access level public
			      
			      public void enterPIN(String pin) 
			      {
			    	  
			    	 PIN.sendKeys(pin); 
			    	  
			      }
			      public void clickctnbtn() 
			      {
			    	  
			    	 ctnbtn.click(); 
			    	  
			      }
	  
			 
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
