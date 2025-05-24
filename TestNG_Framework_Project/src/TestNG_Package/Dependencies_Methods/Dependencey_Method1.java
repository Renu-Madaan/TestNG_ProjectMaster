package TestNG_Package.Dependencies_Methods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencey_Method1 {

	@Test(priority=1)
	public void openapp() {
		System.out.println("Open the application");

		Assert.assertTrue(true);

	}

	@Test(priority =2, dependsOnMethods= {"openapp"})
	
	public void login() {
		System.out.println("Login into  the application");

		Assert.assertTrue(false);
	}

	@Test(priority=3, dependsOnMethods= {"login"})
	
	public void search() {
		System.out.println("search functionality");

		Assert.assertTrue(true);
	}

	@Test(priority=4, dependsOnMethods={"search"})
	public void addsearch() {
		System.out.println("Advance search functionality");

		Assert.assertTrue(true);
	}

	@Test(priority =5, dependsOnMethods= {"login"})
	public void logout()
	{
		System.out.println("logout from the application");

		Assert.assertTrue(true);

	}

}
