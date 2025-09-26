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

public class TestActivity9 {
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
			@Test
			// Home page
				public void testCase1() {
					WebElement linkElement = driver.findElement(By.linkText("My Account"));
					linkElement.click();
					System.out.println(driver.getTitle());
						
			        Assert.assertEquals(driver.getTitle(),"My Account – Alchemy LMS");
				}
			@Test
		// Navigate to the “My Account” page on the site and Login to the account
				public void testCase2() {
					
					driver.findElement(By.cssSelector("a.ld-login")).click();
					
					WebElement userId = driver.findElement(By.id("user_login"));
					WebElement password = driver.findElement(By.id("user_pass"));
					
					userId.sendKeys("root");
					password.sendKeys("pa$$w0rd");
					
					driver.findElement(By.id("wp-submit")).click();
					
					//Wait
					System.out.println(driver.getTitle());
					
			        Assert.assertEquals(driver.getTitle(),"My Account – Alchemy LMS");

				}		
			@Test
			// Navigating to all courses
			public void testCase3() {
				WebElement linkElement = driver.findElement(By.linkText("All Courses"));
				linkElement.click();
				System.out.println(driver.getTitle());
					
		        Assert.assertEquals(driver.getTitle(),"All Courses – Alchemy LMS");
			}
			
		// Navigating to Social Media Marketing course
			@Test
			public void testCase4() {
				
				driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div/div/div/div[1]/article/div[2]/p[2]/a")).click();
		
				System.out.println(driver.getTitle());
				Assert.assertEquals(driver.getTitle(),"Social Media Marketing – Alchemy LMS");

			}
			
			@Test
			// Navigating to course content
			public void testCase5() {
				
				WebElement course = driver.findElements(By.cssSelector("div.ld-item-title")).get(0);
				course.click();
				
				System.out.println(driver.getTitle());
				Assert.assertEquals(driver.getTitle(),"Developing Strategy – Alchemy LMS");
				
			}
			
			@Test
			// Navigating to lesson in the course content
			public void testCase6() {
				
				WebElement lesson = driver.findElements(By.cssSelector("div.ld-lesson-title")).get(1);
				lesson.click();
				
				System.out.println(driver.getTitle());
				Assert.assertEquals(driver.getTitle(),"Monitoring & Digital Advertising – Alchemy LMS");
				
			}
			@Test
			// finding the next lesson button since course complete option is not available not this lesson
			public void testCase7() {
				
//				WebElement subLession = driver.findElements(By.cssSelector("div.ld-topic-title")).get(0);
//				subLession.click();
//				WebElement markComplete = driver.findElements(By.cssSelector("learndash_mark_complete_button")).get(2);
//				markComplete.click();
				WebElement nextLession = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[4]/div[2]/a"));
				nextLession.click(); 
				
				System.out.println(driver.getTitle());
				Assert.assertEquals(driver.getTitle(),"Investment & Marketing Final Strategies – Alchemy LMS");
				
			}
			
		// create a tear down function
			@AfterClass
				public void teardown() {
		// close the driver
					driver.quit();
				}
}
