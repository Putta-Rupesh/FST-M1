package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity3 {
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
			driver.get("https://training-support.net/webelements/login-form");
			
			
		}
		
		@Test
		public void testCase1() {
	        // Assert page title
	        Assert.assertEquals(driver.getTitle(), "Selenium: Login Form");
		}
		@Test
		public void testCase2() {
			// Find the username and password fields
	        WebElement username = driver.findElement(By.id("username"));
	        WebElement password = driver.findElement(By.id("password"));
	 
	        // Enter credentials
	        username.sendKeys("admin");
	        password.sendKeys("password");
	 
	        // Click login
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();
	 
	        // Read login message
	        String loginMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.text-center"))).getText();
	       // String loginMessage = driver.findElement(By.cssSelector("h2.text-center")).getText();
	        Assert.assertEquals(loginMessage,"Welcome Back, Admin!");
	    }
		
		// create a tear down function
		@AfterClass
		public void teardown() {
			// close the driver
			driver.quit();

		}
}
