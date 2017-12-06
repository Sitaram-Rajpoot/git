package com.test.automation.uiAutomation.uiActions;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.test.automation.uiAutomation.testBase.TestBase;

public class TN_SearchPage_Objects extends TestBase {

	public static final Logger log = Logger.getLogger(TN_SearchPage_Objects.class.getName());
	@FindBy(xpath = ".//*[@id='search']/input")
	WebElement searchele;
	String textdata = "Global Automotive Crash Test Barrier Market 2017-2021";

	@FindBy(xpath=".//*[@id='products']/div/div/div/div/div[2]/div/div/h5/a")
	
	private WebElement reporttitle;
	
	@FindBy(xpath=".//*[@id='product col-sm-4']//*[@class='btn btn-primary button-cart']")
	private WebElement clickreportele;
	
	
	@FindBy(xpath=".//*[@id='product col-sm-4']/div[6]/div/div/div[3]/button")
	public  WebElement buynowele;
	
	
	
	@FindBy(xpath=".//*[@id='products']/div/div/div/div/div[2]/div/div/h5/a")
	WebElement openreportbtn;
	
	
	
	//get list of elements
	
	
	@FindBy(id="listBox")
	
	List<WebElement> selectlist;
	
	
	
	
	
	public void listofelements()
	{
		
		Select select =new Select((WebElement) selectlist);
		
		
		
	}
	
	
	
	
	
	public TN_SearchPage_Objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	
	

	public void searchAndenterReportname() {
		searchele.sendKeys(textdata);
		Actions action= new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();

	}
	
	public void getreporttitle()
	{
		String actualtxt=reporttitle.getText();
		System.out.println("actualtxt="+actualtxt);
		String expected="Global Automotive Crash Test Barrier Market 2017-2021";
		System.out.println("expected="+expected);
		Assert.assertTrue(actualtxt.contains(expected));
	}
	public void openreport()
	{
		openreportbtn.click();
	}
	
	public void checkreportbuynowbuttonvisible()
	{
		clickreportele.isDisplayed();
	}
	
	
	public void ClickontheBuynowbtn()
	{
		clickreportele.click();
		}
	
	
	@Override
	public void waitForElement(WebDriver driver, int timeOutInSeconds, WebElement buynowele) {
		// TODO Auto-generated method stub
		super.waitForElement(driver, timeOutInSeconds, buynowele);
	}
	
}
