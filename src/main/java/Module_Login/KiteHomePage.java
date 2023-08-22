
package Module_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	 //POM Class 3
	
		//step 1-Data member/variable should be declared globally with access level private by using @findBy annotation
		
		     @FindBy(xpath="//span[@class='icon icon-bookmark']")  private WebElement UserID;
		     
		     @FindBy(xpath="//a[text()='Logout']")  private WebElement logoutbtn;
		
		   //step 2-Initialize within a constructor with access level public using pagefactory class
		     
		      public KiteHomePage (WebDriver driver)
		     {
		    	 
		    	 PageFactory.initElements(driver, this);
		    	 
		    	 
		     }
		      //step 3- Utilize within a method with access level public  
		      public String getkiteHomepageUserID() 
		      {
		    	 String UserIDvalue=UserID.getText(); 
		    	 return UserIDvalue;
		    	  
		      }
		       
	             public void clickuserID() 
	    	    {
	    	    	UserID.click();
	    	    	
	    	    }
	            public void clicklogoutbtn() 
	    	    {
	            	logoutbtn.click();
	    	    	
	    	    }
	    	  
	    	  

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
