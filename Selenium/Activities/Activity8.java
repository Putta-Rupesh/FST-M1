package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	public static void main(String[] args) {
		// initialize WebDriver
		WebDriver driver = new FirefoxDriver(); //ChromeDriver() , EdgeDriver()
		Actions builder = new Actions(driver);
		// open the web page
		driver.get("https://training-support.net/webelements/mouse-events");
		
		//verify the title to check if we are in right page or not
		System.out.println("Page Title is: "+ driver.getTitle());
		
		 // Find the elements that can be clicked
        WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
        WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
        WebElement srcButton = driver.findElement(By.xpath("//h1[text()='src']"));
        WebElement targetButton = driver.findElement(By.xpath("//h1[text()='target']"));
        
     // Perform left click on Cargo.lock and then on Cargo.toml
        builder.click(cargoLock).pause(Duration.ofSeconds(2)).click(cargoToml).pause(2000).build().perform();
        
        String result = driver.findElement(By.id("result")).getText();
        
        System.out.println(result);
        
     //Double click on the src button. 
        builder.doubleClick(srcButton).pause(Duration.ofSeconds(2)).pause(Duration.ofSeconds(2)).contextClick(targetButton).pause(Duration.ofSeconds(2)).perform();
        
        builder.click(driver.findElement(By.xpath("//span[text()='Open']"))).pause(Duration.ofSeconds(1)).build().perform();
        
      
        result = driver.findElement(By.id("result")).getText();
        
        System.out.println(result);
     //Then right click on the target button and select open.
     //Print the confirmation text at the end of the sequence.
        
     // Close the browser
        driver.quit();

	}

}
