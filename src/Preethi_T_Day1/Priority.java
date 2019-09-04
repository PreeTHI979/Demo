package Preethi_T_Day1;

import org.testng.annotations.Test;

public class Priority {
  @Test(priority=3)
  public void testGoogle() {
	  System.out.println("Testing google");
	  
  }
  @Test(priority=2,enabled=false)
  public void testFacebook() {
	  System.out.println("Testing facebook");
  }
  @Test(priority=1)
  public void testTwitter() {
	  System.out.println("Testing twitter");
  }
}
