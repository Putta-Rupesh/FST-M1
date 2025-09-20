package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 {

	public static void main(String[] args) {
		 // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/alerts");
        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
        //Find the button to open a CONFIRM alert and click it.
        driver.findElement(By.id("prompt")).click();
        
        //Switch the focus from the main window to the Alert box and get the text in it and print it.
        Alert promptAlert = driver.switchTo().alert();
        System.out.println("Alert message on page is: "+ promptAlert.getText());
        
        // Type text into the alert
        promptAlert.sendKeys("Awesome!");
       // Thread.sleep(5000);    
        
        //Close the alert once with Ok.
        promptAlert.accept();
        
        //Display the result message
        System.out.println("Result message is : "+ driver.findElement(By.id("result")).getText());
        

	}

}
