package TestNG_Package.ATBT;

import org.testng.annotations.Test;

public class SignUpTests {
	@Test(priority=1, groups= {"Regression"})
	void signupByEmail()
	{
		System.out.println("This is Sign-up By email");
	}
	@Test(priority=2, groups= {"Regression"})
	void signupByFacebook()
	{
		System.out.println("This is Sign-up By Facebook");
	}
	@Test(priority=3, groups= {"Regrssion"})
	void signupBytwitter()
	{
		System.out.println("This is signup By twitter");
	}
	

}
