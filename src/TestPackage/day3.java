package TestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3 {

	@Test
	public void webviewHomeloan()
	{
		System.out.println("Test 1");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileHomeloan()
	{
		System.out.println("Test 2");
	}
	
	
	@Test
	public void APIHomeloan()
	{
		System.out.println("Test 3");
	}
	
	@Test
	public void T4n()
	{
		System.out.println("Test 4");
	}
	

	
}
