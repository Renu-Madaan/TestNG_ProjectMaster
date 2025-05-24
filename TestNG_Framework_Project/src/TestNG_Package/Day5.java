package TestNG_Package;

import org.testng.annotations.Test;

public class Day5 {
	@Test(priority = -3)
	public void login() {
		System.out.println("Login into app");
	}
	@Test(priority = -2)
	public void logout() {
		System.out.println("Logout from Application");
	}

	
	
	

}
