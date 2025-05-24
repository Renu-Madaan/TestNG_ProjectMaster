package Parameterization1Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderdemo1 {
	WebDriver driver;

	@BeforeClass
	void setup()
	{
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//ElementNotInteractableException: element not interactable
	//org.testng.internal.reflect.MethodMatcherException: 
	}
		
	

@Test(dataProvider="dp")
	void testLogin(String email,String pwd) throws InterruptedException {
driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");		

driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("email");

driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("pwd");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@value='Login']")).click();


boolean status= driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='My Account']")).isDisplayed();
if(status==true)
{
	driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")).click();
	Assert.assertTrue(true);
}
else
{
	Assert.fail();
	}
		
		
		
	}

	@AfterClass
	void tearDown() 
	{
		driver.quit();
	}
	
	
	  @DataProvider(name="dp",indices= {0,1}) 
	  Object[] [] loginData() 
	  { 
		  Object[][] data= {
	  
	  {"abc1@gmail.com","test@123"}, {"abc2@gmail.com","test@1234"},
	  {"abc3@gmail.com","test@1235"}, {"abc4@gmail.com","test@1236"},
	  
	  };
	  
	  return data; }
	 

}
