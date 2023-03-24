package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	public void enterUserName(String username) {

		driver.findElement(By.name("user_name")).sendKeys(username);

	}

	public void enterUserPassword(String password) {

		driver.findElement(By.name("user_password")).sendKeys(password);

	}

	public void clickOnLoginButton() {

		driver.findElement(By.name("Login")).click();
	}
}
