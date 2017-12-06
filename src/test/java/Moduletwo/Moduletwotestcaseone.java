package Moduletwo;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;

public class Moduletwotestcaseone extends TestBase{
	
	@Test
	public void testexample()
	{
		Assert.assertTrue("hello".contains("Hello"));
	}

	@Test
	public void testexampletwo()
	{
		Assert.assertTrue("Hello".contains("Hello"));
	}
}
