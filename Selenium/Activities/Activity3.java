package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity3 {

	public static void main(String[] args) {
		// initialize WebDriver
		WebDriver driver = new FirefoxDriver(); //ChromeDriver() , EdgeDriver()
		//driver.manage().implicitlyWait(Duration.ofSeconds(10);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		// open the web page
		driver.get("https://training-support.net/webelements/login-form");
		
		//verify the title to check if we are in right page or not
		System.out.println("Page Title is: "+ driver.getTitle());
		
		//interact with elements in page
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(), ' Success!')]")));
		// Print the confirmation message
        String message = driver.findElement(By.xpath("//h1[contains(text(), ' Success!')]")).getText();
        System.out.println("Login Page title is: "+ message);
        
        String message1 = driver.findElement(By.xpath("//h2[contains(@class,'text-gray')]")).getText();
        System.out.println("Login Page title is: "+ message1);
		
		//Close
		driver.quit();

	}

}
