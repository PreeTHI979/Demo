package Preethi_T_Day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
  @Test
  public void f() {
	  System.out.println("First validation");
	  Assert.assertEquals(10,20);
	  System.out.println("Second validation");
	  Assert.assertEquals(10,10);
  }
}
