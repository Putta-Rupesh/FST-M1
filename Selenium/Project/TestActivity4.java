package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity4 {
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
	
// Read the title of the second most popular course on the website and verify the text

	@Test
	public void testCase1() {
		String message = driver.findElement(By.xpath("//h3[text()='Email Marketing Strategies']")).getText();
        System.out.println(message);
        
        Assert.assertEquals(message, "Email Marketing Strategies");
	}
	
// create a tear down function
	@AfterClass
	public void teardown() {
		// close the driver
		driver.quit();
	}

}
