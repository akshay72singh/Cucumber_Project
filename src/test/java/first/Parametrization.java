package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parametrization {

	WebDriver driver ;
	
	@Given("browser is open")
	public void browser_is_open() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\sa\\CucumberJava\\drivers\\chromedriver.exe" );
	driver= new ChromeDriver();
	 driver.get("http://localhost:8888/");
	}

	@And("hit the Url")
	public void hit_the_url() {
	    driver.get("http://localhost:8888/");
	}

	@When("user enterned vailid (.*) and (.*)")
	public void user_enterned_vailid_admin_and_admin(String username,String password) throws InterruptedException {
	    driver.findElement(By.name("user_name")).sendKeys(username);
	    driver.findElement(By.name("user_password")).sendKeys(password);

	}

	@Then("user Nevigated on Home Pge Successfully")
	public void user_nevigated_on_home_pge_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
