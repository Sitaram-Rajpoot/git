package Moduletwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.uiActions.TN_SearchPage_Objects;

public class ListofElements {
	WebDriver driver;
	
	TN_SearchPage_Objects obj= new TN_SearchPage_Objects(driver);
	
	
	@Test
	public void listexample()
	{
		
	driver.get("https://www.hscripts.com/scripts/jquery/districts-select-list.php");
	
	obj.listofelements();
		
		
		
		
	}

}
