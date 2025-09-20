package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity18 {

	public static void main(String[] args) {
		 // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/alerts");
        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
        //Find the button to open a SIMPLE alert and click it.
        driver.findElement(By.id("simple")).click();
        
        //Switch the focus from the main window to the Alert box and get the text in it and print it.
        Alert simpleAlert = driver.switchTo().alert();
        System.out.println("Alert message on page is: "+ simpleAlert.getText());
        
        //Close the alert once with OK.
        simpleAlert.accept();
        
        //Display the message
        System.out.println("Result message is : "+ driver.findElement(By.id("result")).getText());
        
        //Close the page
        driver.quit();
	}

}
