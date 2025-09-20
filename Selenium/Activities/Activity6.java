package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity6 {

	public static void main(String[] args) {
		// initialize WebDriver
		WebDriver driver = new FirefoxDriver(); //ChromeDriver() , EdgeDriver()
		
		// open the web page
		driver.get("https://training-support.net/webelements/dynamic-controls");
		
		//verify the title to check if we are in right page or not
		System.out.println("Page Title is: "+ driver.getTitle());
		
		 // Find the checkbox
        WebElement checkbox = driver.findElement(By.id("checkbox"));
        // Click it
        checkbox.click();
        // Check if it is selected
        System.out.println("Checkbox is selected: " + checkbox.isSelected());
        // Click the checkbox again
        checkbox.click();
        // Check if it is selected
        System.out.println("Checkbox is selected: " + checkbox.isSelected());

		
		//Close
		driver.quit();


	}

}
