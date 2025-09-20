package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		// initialize WebDriver
				WebDriver driver = new FirefoxDriver(); //ChromeDriver() , EdgeDriver()
				
				// open the web page
				driver.get("https://training-support.net/");
				
				//verify the title to check if we are in right page or not
				System.out.println("Page Title is: "+ driver.getTitle());
				
				//interact with elements in page
				// Click on the about us button
				
				driver.findElement(By.className("card")).click();
				//driver.findElement(By.css**) --> with CSS we can give multiple classes
				//driver.findElement(By.linkText("About Us")).click();
				
				// verify the title in the about page
				System.out.println("New Page Title is: "+ driver.getTitle());
				
				//Close
				driver.quit();
	}

}
