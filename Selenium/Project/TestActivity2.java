package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity2 {
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
			// Read the heading of the website and verify the text
			@Test
			public void testCase1() {
				String message = driver.findElement(By.tagName("h1")).getText();
		        System.out.println(message);
		        
		        Assert.assertEquals(message, "Learn from Industry Experts");
			}
			
		// create a tear down function
			@AfterClass
			public void teardown() {
				// close the driver
				driver.quit();
			}
}
