package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
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
		driver.get("https://training-support.net/webelements/target-practice");
		
	}
	
	@Test
	public void testCase1() {
        // Assert page title
        Assert.assertEquals(driver.getTitle(), "Selenium: Target Practice");
	}
	@Test
	public void testCase2() {
		// This test case will Fail
        WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "black");
	}
	
	@Test(enabled = false)
    public void testCase3() {
        // This test will be skipped and not counted
        String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
    }
	
	@Test
	public void testCase4() {
        // This test will be skipped and will be be shown as skipped
        throw new SkipException("Skipping test case");
    }
	
	// create a tear down function
	@AfterClass
	public void teardown() {
		// close the driver
		driver.quit();
	}
}
