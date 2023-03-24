package first;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class F {
	WebDriver driver;
	@Given("browser is launched")
	public void browser_is_launched() throws IOException {
	  System.out.println("browser launched");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\sa\\CucumberJava\\drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://flipkart.com");
	}

	@When("enter user name and password")
	public void enter_user_name_and_password() {
System.out.println("User name and password");
	}

	@When("click on login btn")
	public void click_on_login_btn() {
	   System.out.println("This is login btn");
	}

	@Then("I validate the Home page")
	public void i_validate_the_home_page() {
	 System.out.println("Home Page");
	}

}
