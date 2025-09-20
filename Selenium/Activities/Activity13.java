package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {

	public static void main(String[] args) {
		// initialize WebDriver
				WebDriver driver = new FirefoxDriver();
				
				// open the web page
				driver.get("https://training-support.net/webelements/tables");
				
				//verify the title to check if we are in right page or not
				System.out.println("Page Title is: "+ driver.getTitle());
				
				// Print the number of columns
		        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th"));
		        System.out.println("Number of columns: " + cols.size());
		        
		     // Print the number of Rows
		        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr"));
		        System.out.println("Number of Rows: " + rows.size());
		        
		     // Print the cells values of the third row
		        System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[3]")).getText());
		     
		        // Print the cell value of the second row and second column 
		        System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[2]/td[2]")).getText());
				// Close the browser
		        driver.quit();

	}

}
