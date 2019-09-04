package Scenario;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass02 {
	  @Test(priority=1)
	  public void tMethod3() {
			  System.out.println("tMethod3");
	  }
	  @Test(priority=2)
	  public void tMethod4() {
			  System.out.println("tMethod4");
	  }
	  @BeforeMethod
	  public void display() {
		  System.out.println("Hi");
	  }
	  @AfterClass
	  public void display1() {
		  System.out.println("After class");
	  }
}
