package Library_File;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class xyz {

	@BeforeClass
	public void jemeter() 
	{
		
		Reporter.log("Logout from App", true);

		
	}
	@Test
	public void TC2() //Test method/Test case
	{
		
		
		Reporter.log("Running TC2", true);
		
	}
	
	
	

	
}
