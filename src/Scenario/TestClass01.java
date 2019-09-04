package Scenario;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass01 {
	
  @Test(priority=5)
  public void tMethod5() {
	  System.out.println("tMethod5");
  }
  @Test(priority=2)
  public void tMethod1() {  
	  System.out.println("tMethod1");
  }
  @Test(priority=1)
  public void tMethod2() {
	  System.out.println("tMethod2");
  }
  @BeforeMethod
  public void display() {
	  System.out.println("Hello");
	  
  }
  @AfterClass
  public void display1() {
	  System.out.println("After class");
  }

}
