package week6.day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {
	
	@BeforeSuite
	public void bs()
	{
		System.out.println("I am in before suite");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("I am in before Test");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("I am in before Class");
	}
	/*@BeforeMethod
	public void bm()
	{
		System.out.println("I am in before Method");
	}
	@BeforeMethod
	public void bm1()
	{
		System.out.println("I am in before Method1");
	}*/
	@Test
	public void test()
	{
		System.out.println("I am inside Test");
	}
	@Test
	public void test1()
	{
		System.out.println("I am inside Test 1");
	}
	/*@AfterMethod
	public void am()
	{
		System.out.println("I am in after Method");
	}*/
	@AfterClass
	public void ac()
	{
		System.out.println("I am in after Class");
	}
	@AfterTest
	public void at()
	{
		System.out.println("I am in after Test");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("I am in after suite");
	}
	
}
