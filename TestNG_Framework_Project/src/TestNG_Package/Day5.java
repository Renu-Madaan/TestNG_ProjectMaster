package TestNG_Package;

import org.testng.annotations.Test;

public class Day5 {
	
		@Test(priority=3)
		public void openApp()
		{
			System.out.println(" Open this application");
		}

		@Test(priority=2)
		public void login()
		{
			System.out.println(" Log -in into the application");
		}
		@Test(priority=4)
		public void logout ()
		{
			System.out.println(" Log-out from the application");
		}
	}

	
	
	
	
	
	
	


