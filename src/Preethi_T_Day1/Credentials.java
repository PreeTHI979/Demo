package Preethi_T_Day1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Credentials {
  @Test(dataProvider="credentials")
  public void testLogin(String uname, String pwd ) {
	  System.out.println("Credentials:" + uname+pwd);
  }
  
  @DataProvider
  public Object[][] credentials(){
	  Object[][] data= {
			  {"Lalitha","Password123"},
			  {"Admin","Password456"}
	  };
	  return data;
  }
 
}
