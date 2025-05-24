package TestNG_Package.ATBT;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day6 {
	@Test
	public void xyz()
	{
		System.out.println("Test");
	}
	@AfterTest()
	public void aF()
	{
		System.out.println("This is After Test");
	}

	

}
