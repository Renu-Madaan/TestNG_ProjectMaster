package TestNG_Package;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Day1 {

		@BeforeTest
		public void bus() {
			System.out.println("This is my old Car");
		}

		@AfterTest
		public void car() {
			System.out.println("This is my New car");
		}

		@Test
		public void bike1() {
			System.out.println("This is my bike Test Ride 1");
		}

		@Test(priority = 2)
		public void bike2() {
			System.out.println("This is my bike Test Ride 2");
		}
	}



