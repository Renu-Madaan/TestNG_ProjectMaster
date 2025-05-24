package TestNG_Package;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AsserstionHardvsSoftDemo2 {
	/*
	 * @Test
	 * 
	 * void test_hardassertions() { System.out.println("testign.......");
	 * System.out.println("testign......."); Assert.assertEquals(1, 2);//hard
	 * asserations
	 * 
	 * 
	 * System.out.println("testign......."); System.out.println("testign.......");
	 * 
	 * }
	 */
		@Test
		void test_Softassertions() {
			System.out.println("testign.......");
			System.out.println("testign.......");
			
			SoftAssert sa = new SoftAssert();
			
			sa.assertEquals(1, 4);//Soft asseration 
			
			
			System.out.println("testign.......");
			System.out.println("testign.......");
			sa.assertAll();
		
		
		
		
		
		
	}

}
