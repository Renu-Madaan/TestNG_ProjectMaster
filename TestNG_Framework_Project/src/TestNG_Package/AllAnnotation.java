package TestNG_Package;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class AllAnnotation {

		@BeforeSuite
		public void bS() {
			System.out.println("This is Before Suit");
		}

		@AfterSuite
		public void aS() {
			System.out.println("This is After Suit");
		}

		@BeforeMethod
		public void bM() {
			System.out.println("This is Before Method");
		}
		@AfterMethod
		public void aM() {
			System.out.println("This is After Method");
		}
		@Test
		public void MT1() {
			System.out.println("This is Main1 Test");
		}

		@Test
		public void MT2() {
			System.out.println("This is Main2 Test");
		}

		@Test
		public void MT3() {
			System.out.println("This is Main3 Test3");
		}
		
		@AfterMethod
		public void AM() {
			System.out.println("This is After Method");
		}

		@BeforeClass
		public void bC() {
			System.out.println("This is Before Class");
		}

		@AfterClass
		public void AC() {
			System.out.println("This is After Class");
		}

		@BeforeTest
		public void bT() {
			System.out.println("This is Before Test");
		}
		@AfterTest
		public void aT() {
			System.out.println("This is Before Test");
		}

		

		

	}

	
	
	

