package TestNG_Package.ATBT;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day8 {
	
	@Test
	public void pqr()
	{
		System.out.println("Test");
	}
	@BeforeSuite()
	public void bS()
	{
		System.out.println("This is before Suite");
	}
	@AfterSuite()
	public void aS()
	{
		System.out.println("This is After Suite");
	}
	
	
	
	
	

}
