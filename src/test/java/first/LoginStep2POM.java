package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep2POM {

	WebDriver driver;
	LoginPage loginPage;
	
	@Given("user is on Login Page")
	public void user_is_on_login_page() {
		System.out.println("User is on login Page");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\sa\\CucumberJava\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http:/localhost:8888/");

	}

	@When("user enterns vailid (.*) and (.*)")
	public void user_enterns_vailid_name_and_password(String username, String password) {

		loginPage = new LoginPage (driver);
		
		loginPage.enterUserName(username);
		loginPage.enterUserPassword(password);
//		driver.findElement(By.name("user_name")).sendKeys(username);
//		driver.findElement(By.name("user_password")).sendKeys(password);

	}

	@When("Click on Login button")
	public void click_on_login_button() {
 
		loginPage.clickOnLoginButton();
//		driver.findElement(By.name("Login")).click();
	}

	@Then("User reached on Home Page")
	public void user_reached_on_home_page() {

		String myHomePageText = driver.findElement(By.xpath("//td[contains(text(),'My Home Page')]")).getText();

		if (myHomePageText.contains("My Home Page")) {
			System.out.println("user is validate hame page easly");
		} else {
			System.out.println("user is unable to validate hame page easly");

		}
	}

}
