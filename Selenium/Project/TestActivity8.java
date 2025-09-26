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

public class TestActivity8 {
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
				WebElement linkElement = driver.findElement(By.linkText("Contact"));
				linkElement.click();
				System.out.println(driver.getTitle());
					
		        Assert.assertEquals(driver.getTitle(),"Contact – Alchemy LMS");
			}
			
		// Login to the account
			@Test
			public void testCase2() {
				
						
				WebElement fullName = driver.findElement(By.id("wpforms-8-field_0"));
				WebElement mailId = driver.findElement(By.id("wpforms-8-field_1"));
				WebElement subject = driver.findElement(By.id("wpforms-8-field_3"));
				WebElement comments = driver.findElement(By.id("wpforms-8-field_2"));
				
				fullName.sendKeys("test");
				mailId.sendKeys("test@gmail.com");
				subject.sendKeys("test");
				comments.sendKeys("test");
				
				driver.findElement(By.id("wpforms-submit-8")).click();
				
				String message = driver.findElement(By.id("wpforms-confirmation-8")).getText();
				System.out.println(message);
				
		        Assert.assertEquals(message,"Thanks for contacting us! We will be in touch with you shortly.");

			}
			
		// create a tear down function
			@AfterClass
			public void teardown() {
		// close the driver
				driver.quit();
			}
}
