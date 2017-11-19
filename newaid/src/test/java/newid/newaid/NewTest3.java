package newid.newaid;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class NewTest3 {

  @Test
  public void afterSuite() {
	  System.out.println("failed test cases");
	  Assert.fail();
  }

}
