package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

	public static void main(String[] args) {
		// initialize WebDriver
				WebDriver driver = new FirefoxDriver(); //ChromeDriver() , EdgeDriver()
				
				// open the web page
				driver.get("https://training-support.net/webelements/dynamic-controls");
				
				//verify the title to check if we are in right page or not
				System.out.println("Page Title is: "+ driver.getTitle());
				
				 // Find the checkbox and make sure it is visible
		        WebElement checkbox = driver.findElement(By.id("checkbox"));
		        System.out.println("Checkbox is visible? " + checkbox.isDisplayed());

		        // Find the button to toggle it and click it
		        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		        
		        // Check if it is visible
		        System.out.println("Checkbox is visible? " + checkbox.isDisplayed());
		        
		        // Toggle the checkbox and click it
		        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		        
		        // Check if it is selected
		        System.out.println("Checkbox is visible? " + checkbox.isDisplayed());
				
				//Close
				driver.quit();

	}

}
