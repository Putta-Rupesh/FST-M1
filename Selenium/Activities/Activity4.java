package Activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4 {

	public static void main(String[] args) {
		// initialize WebDriver
		WebDriver driver = new FirefoxDriver();
		
		// open the web page
		driver.get("https://training-support.net/webelements/target-practice");
		
		//verify the title to check if we are in right page or not
		System.out.println("Page Title is: "+ driver.getTitle());
		
		//String header3 = driver.findElement(By.xpath("//h3[contains(@class,'text-3xl font-bold text-orange-600')]")).getText();
		String header3 = driver.findElement(By.xpath("//h3[@class = 'text-3xl font-bold text-orange-600']")).getText();
		System.out.println(header3);
		// Find the 5th header and print its color
        Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(), '#5')]")).getCssValue("color"));
        System.out.println("Color as RGB: " + fifthHeaderColor.asRgb());
        System.out.println("Color as hexcode: " + fifthHeaderColor.asHex());
        
     // Find the violet button and print its classes
        String purpleButtonClass = driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class");
        System.out.println(purpleButtonClass);
        
        // Find the grey button and print its text
        String slateButtonText = driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText();
        System.out.println(slateButtonText);

        // Close the browser
        driver.quit();
	}

}
