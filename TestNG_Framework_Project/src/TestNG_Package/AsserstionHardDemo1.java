package TestNG_Package;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AsserstionHardDemo1 {
	@Test
	void test() {
		
		/*
		 * Assert.assertEquals("XYZ", "XYZ");
		 * 
		 * Assert.assertEquals("XYZ", "xyz");
		 * 
		 * Assert.assertEquals("abc", "123"); Assert.assertEquals("XYZ", 123); //
		 * Assert.assertNotEquals("RAMA", "RAM","RAM");
		 * 
		 * 
		 * Assert.assertTrue(false);//Failed Assert.assertTrue(true);
		 */
		
		//Assert.assertTrue(1==2);//fail
		//Assert.assertTrue(1==1);//passed
		Assert.fail();

	}

}
