package TestNG_Package.ATBT;

import org.testng.annotations.Test;

public class paymentTests {
	@Test(priority=1, groups= {"sanity", "regression","Functional"})
	void paymentByRupees()
	{
		System.out.println("Payment by rupees");
	}
	@Test(priority=2, groups= {"sanity","regression","Functional"})
	void paymentByDollars()
	{
		System.out.println("Payment by dollars");
	}

}
