package TestNG_Package.ATBT;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day7 {
	@Test
	public void abc()
	{
		System.out.println("Test");
	}
	@BeforeTest()
	public void bT()
	{
		System.out.println("This is Before Test");
	}

}
