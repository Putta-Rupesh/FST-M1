package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity1 {
	
		// declare class objects
				WebDriver driver;
				
		// create a setup function
				@BeforeClass
				public void setUp()
				{
					// Driver initialization
					driver = new FirefoxDriver();
					// open the page
					driver.get("https://training-support.net");
					
				}
				
		// Create test function
				@Test(priority = 1)
				public void homePageTest() {
			        // Assert page title
			        Assert.assertEquals(driver.getTitle(), "Training Support");
				}
				
				@Test(priority = 2)
				public void AboutUsPageTest() {
					driver.findElement(By.linkText("About Us")).click();
					Assert.assertEquals(driver.getTitle(), "About Training Support");
				}
				
		// create a tear down function
				@AfterClass
				public void teardown() {
					// close the driver
					driver.quit();
				}

}
