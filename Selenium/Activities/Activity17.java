package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {

	public static void main(String[] args) {
		 // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/selects");
        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
        // get the options
       WebElement dropdown = driver.findElement(By.cssSelector("select.h-80"));
       Select multiSelect = new Select(dropdown);
       
       //Select the "HTML" option using the visible text.
       multiSelect.selectByVisibleText("HTML");
       
       //Select the 4th, 5th and 6th options using the index.
       multiSelect.selectByIndex(4);
       multiSelect.selectByIndex(5);
       multiSelect.selectByIndex(6);
       
       //Select the "Node" option using the value.
       multiSelect.selectByValue("nodejs");
       
       List<WebElement> allOptions = multiSelect.getAllSelectedOptions();
       System.out.println("All Selected OPtions");
       for(WebElement option : allOptions)
       {
    	   System.out.println(option.getText());
       }
       //Deselect the 5th option using index.
       multiSelect.deselectByIndex(5);
       
       // Again printing all the selected options
       List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
       System.out.println("All Selected OPtions");
       for(WebElement option1 : selectedOptions)
       {
    	   System.out.println(option1.getText());
       }
       
    // close the browser
       driver.quit();
       

	}

}
