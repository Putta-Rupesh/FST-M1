package StepDefination;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TSHomePageSteps extends BaseClass {
	@Given("the user is on TS homepage")
	public void openTSHomepage() throws Throwable{
		// Open the browser
		driver.get("https://training-support.net");
		assertEquals(driver.getTitle(), "Training Support");
	}

	@When("they click on the about us link")
	public void clickButton() throws Throwable {
		driver.findElement(By.linkText("About Us")).click();
	}

	@Then("they are redirected to the about us page")
	public void aboutUsPage() throws Throwable {
		wait.until(ExpectedConditions.titleIs("About Training Support"));
		String pageHeading = driver.findElement(By.cssSelector("h1.text-center")).getText();

		System.out.println("New page title is: " + pageHeading);
		assertEquals(pageHeading, "About Us");
	}
}