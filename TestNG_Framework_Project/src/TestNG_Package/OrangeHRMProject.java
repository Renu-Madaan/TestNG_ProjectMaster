package TestNG_Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMProject {

	WebDriver driver;

	/*
	 * Open an application test logo presense Login LogOut
	 */

	@Test(priority = 1)
	public void openApp() {
		System.out.println(" Open this application");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}

	@Test(priority = 3)
	public void testlogo() throws InterruptedException {
		Thread.sleep(3000);

		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Presence of logo" + status);

	}

	@Test(priority = 4)
	public void login() {
		System.out.println(" Log -in into the application");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@Test(priority = 5)
	public void logout() {
		System.out.println(" Log-out from the application");

	}

}
