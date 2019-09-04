package Preethi_T_Day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_All_demo {

	@BeforeClass
	public void a(){
		System.out.println("Before class");
	}
	@AfterClass
	public void b(){
		System.out.println("After class");
	}
	@BeforeMethod
	public void a1(){
		System.out.println("Before method");
	}
	@AfterMethod
	public void b1(){
		System.out.println("After method");
	}
	@BeforeTest
	public void a2(){
		System.out.println("Before Test");
	}
	@AfterTest
	public void b2(){
		System.out.println("After Test");
	}
	@BeforeSuite
	public void a3(){
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void b3(){
		System.out.println("After Suite");
	}

	@Test
	public void display1(){
		System.out.println("Hello");
	}
	@Test
	public void display2(){
		System.out.println("Hi");
	}
}
