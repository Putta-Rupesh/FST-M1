package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// initialize WebDriver
				WebDriver driver = new FirefoxDriver(); //ChromeDriver() , EdgeDriver()
				
				// open the web page
				driver.get("https://training-support.net/webelements/login-form");
				
				//verify the title to check if we are in right page or not
				System.out.println("Page Title is: "+ driver.getTitle());
				
				//interact with elements in page
				driver.findElement(By.id("username")).sendKeys("admin");
				driver.findElement(By.id("password")).sendKeys("password");
				driver.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();
				
				 String message = driver.findElement(By.tagName("h1")).getText();
			     System.out.println(message);
			     
			     String message1 = driver.findElement(By.tagName("h2")).getText();
			     System.out.println(message1);
			     
				//Close
				//driver.quit();

	}

}
