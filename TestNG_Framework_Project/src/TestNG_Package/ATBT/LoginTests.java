package TestNG_Package.ATBT;

import org.testng.annotations.Test;

public class LoginTests{
	@Test(priority=1, groups= {"sanity"})
	void loginByEmail()
	{
		System.out.println("This is login By email");
	}
	@Test(priority=2, groups= {"sanity"})
	void loginByFacebook()
	{
		System.out.println("This is login By Facebook");
	}
	@Test(priority=3,groups= {"sanity"})
	void loginBytwitter()
	{
		System.out.println("This is login By twitter");
	}
	}
