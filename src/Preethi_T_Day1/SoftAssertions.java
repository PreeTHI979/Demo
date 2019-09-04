package Preethi_T_Day1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
  @Test
  public void f() {
	  SoftAssert sa=new SoftAssert();
	  System.out.println("First validation");
	  sa.assertEquals(10,20);
	  System.out.println("Second validation");
	  sa.assertEquals(10,10);
	  sa.assertAll();
	  
  }
}
