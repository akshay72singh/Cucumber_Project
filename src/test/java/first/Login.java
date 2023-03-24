package first;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	
	@Given("user is on Login Page")
	public void user_is_on_login_page() {
	   System.out.println("User is on login Page");
	}

	@When("user enterns vailid name and password")
	public void user_enterns_vailid_name_and_password() {
	    System.out.println("vailid user name and password");
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	    System.out.println("Click on login button");
	}

	@Then("User reached on Home Page")
	public void user_reached_on_home_page() {
	 System.out.println("User is On Home page");   
	}

}
