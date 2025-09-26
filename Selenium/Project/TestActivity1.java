package Activities;

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
			driver.get("https://alchemy.hguy.co/lms");
			
		}
		
		@Test
		public void testCase1() {
	        // Assert page title
	        Assert.assertEquals(driver.getTitle(), "Alchemy LMS – An LMS Application");
		}
		
	// create a tear down function
		@AfterClass
		public void teardown() {
			// close the driver
			driver.quit();
		}

}
