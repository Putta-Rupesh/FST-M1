package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {

	public static void main(String[] args) {
		 // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/selects");
        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
        // get the options
       WebElement dropdown = driver.findElement(By.cssSelector("select.h-10"));
       Select singleSelect = new Select(dropdown);
       
    //   Select the second option using the visible text.
       singleSelect.selectByContainsVisibleText("One");
       System.out.println(singleSelect.getFirstSelectedOption().getText());
      
   //    Select the third option using the index.
       
       singleSelect.selectByIndex(3);
       System.out.println(singleSelect.getFirstSelectedOption().getText());
       
     //  Select the fourth option using the value.
       singleSelect.selectByValue("five");
       System.out.println(singleSelect.getFirstSelectedOption().getText());
       
     //  Get all the options and print them to the console.
       List<WebElement> allOptions = singleSelect.getOptions();
       System.out.println("Options in the dropdown: ");
       for(WebElement option : allOptions) 
       {
           System.out.println(option.getText());
       }
     // close the browser
       driver.quit();

	}

}
