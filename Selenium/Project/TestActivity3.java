package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity3 {
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
	//Read the title of the first info box on the website and verify the text
				@Test
				public void testCase1() {
					String message = driver.findElement(By.xpath("//h3[text()=' Actionable Training ']")).getText();
			        System.out.println(message);
			        
			        Assert.assertEquals(message, "Actionable Training");
				}
				
	// create a tear down function
				@AfterClass
				public void teardown() {
					// close the driver
					driver.quit();
				}
}
