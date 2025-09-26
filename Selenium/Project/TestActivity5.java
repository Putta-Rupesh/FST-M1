package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity5 {
	// declare class objects
		WebDriver driver;
		WebDriverWait wait;
		
	// create a setup function
		@BeforeClass
		public void setUp()
		{
			// Driver initialization
			driver = new FirefoxDriver();
			// Wait Initialization
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			// open the page
			driver.get("https://alchemy.hguy.co/lms");
			
		}
		
	// Navigate to the “My Account” page on the site.

		@Test
		public void testCase1() {
			WebElement linkElement = driver.findElement(By.linkText("My Account"));
			linkElement.click();
			System.out.println(driver.getTitle());
			
	        Assert.assertEquals(driver.getTitle(),"My Account – Alchemy LMS");
		}
		
	// create a tear down function
		@AfterClass
		public void teardown() {
			// close the driver
			driver.quit();
		}

}
