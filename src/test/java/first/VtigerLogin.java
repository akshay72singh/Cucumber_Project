package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VtigerLogin {

	WebDriver driver ;
	
//	@When("Browser is open")
//	public void Browser_is_open() {
//		
//	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Desktop\\\\sa\\\\CucumberJava\\\\drivers\\\\chromedriver.exe");	
//	driver= new ChromeDriver();
//	
//	}
	@And("hit the url")
	public void hit_the_url() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\sa\\CucumberJava\\drivers\\chromedriver.exe");	
		driver= new ChromeDriver();
		driver.get("http://localhost:8888/");
		
	}

	@When("user enterned vailid name and password")
	public void user_enterned_vailid_name_and_password() {
	   
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");

	}

	@And("click on Login button")
	public void click_on_login_button() {
	    
		driver.findElement(By.name("Login")).click();
		
	}

	@Then("User nevigated on Home Page Successfully")
	public void user_nevigated_on_home_page_successfully() {
	   
		String myHomePageText = driver.findElement(By.xpath("//td[contains(text(),'My Home Page')]")).getText();
		
		if(myHomePageText.contains("My Home Page")) {
			System.out.println("user is validate hame page easly");
		}else {
			System.out.println("user is unable to validate hame page easly");

		}
	}
}
