package Moduleone;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.TN_SearchPage_Objects;

public class TNSearchtheReport extends TestBase {

	TN_SearchPage_Objects tnsearchobj;

	@BeforeClass
	public void setup() throws IOException {
		init();

	}

	@Test
	public void verifySerchReportonTN() {
		log.info("=========== Starting verifyLoginWithInvalidCredentails Test=============");

		tnsearchobj = new TN_SearchPage_Objects(driver);
		
		tnsearchobj.searchAndenterReportname();
		// Assert.assertEquals(tnsearchobj.getInvalidLoginText(),
		tnsearchobj.getreporttitle();
		log.info("=======Get Search Report title===");
	
	}
	
	@Test
	public void openreport(){
		tnsearchobj.openreport();
	}
	
	@Test
	public void clickonreport()
	{
	tnsearchobj.checkreportbuynowbuttonvisible();
	log.info("check buynow visible on the page");
	}
	
	@Test
	public void clickonbuynowbtn()
	{
	tnsearchobj.ClickontheBuynowbtn();
	log.info("click on the Search Report");
	}
	
	
	

	@AfterClass
	public void endTest() {
		driver.close();
		log.info("Browser closed");
	}

}
