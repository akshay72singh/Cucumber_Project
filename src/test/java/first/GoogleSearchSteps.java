package first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver ;
	
	@Given("Browser is open")
	public void browser_is_open() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\sa\\CucumberJava\\drivers\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@And("user is on search page of Google")
	public void user_is_on_search_page_of_google() {

		driver.get("https://google.com");
	}

	@When("user is entered some text in search box")
	public void user_is_entered_some_text_in_search_box() {

		driver.findElement(By.name("q")).sendKeys("iphone");
		
	}

	@And("hits enter button")
	public void hits_enter_button() {

		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is nevigated to searched result")
	public void user_is_nevigated_to_searched_result() {

		String iPhoneText=driver.findElement(By.xpath("//span[text()='The new iPhone - Apple Official Site']")).getText();
		
		if(iPhoneText.equalsIgnoreCase("The new iPhone - Apple Official Site")) {
			System.out.println("User is Nevigated on searched Page - iPhone Page");
		}else {
			System.out.println("User is unable to Nevigated on searched Page - iPhone Page");
		}
	}
}
