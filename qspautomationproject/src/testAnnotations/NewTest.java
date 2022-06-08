package testAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void test1()
  {
	  Reporter.log("Test case 1",true);
  }
  
  @Test
  public void test2()
  {
	  Reporter.log("Test case 2",true);
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("beforeMethod",true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("afterMethod",true);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("beforeClass",true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("afterClass",true);
  }

  @BeforeTest
  public void beforeTest() 
  {
	  Reporter.log("beforeTest",true);
  }

  @AfterTest
  public void afterTest()
  {
	  Reporter.log("afterTest",true);
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  Reporter.log("beforeSuite",true);
  }

  @AfterSuite
  public void afterSuite() 
  {
	  Reporter.log("afterSuite",true);
  }

}
