package Activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity7 {
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
			WebElement linkElement = driver.findElement(By.linkText("All Courses"));
			linkElement.click();
			System.out.println(driver.getTitle());
				

			// Find all the courses on the page
			List<WebElement> courses = driver.findElements(By.cssSelector("p.ld_course_grid_button")); 

			// Print the number of courses
			System.out.println("Number of courses: " + courses.size());

	        Assert.assertEquals(driver.getTitle(),"All Courses – Alchemy LMS");
	        
		}
		
	// create a tear down function
		@AfterClass
		public void teardown() {
	// close the driver
			driver.quit();
		}

}
