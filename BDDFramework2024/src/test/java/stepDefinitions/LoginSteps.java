package stepDefinitions;

import org.openqa.selenium.WebDriver;

import PageObjectModel.FbLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	private static FbLogin facebook = new FbLogin();
	private static WebDriver driver = FbLogin.openBrowser(5);
	
//	public LoginSteps() {
//		facebook = new FbLogin();
//		driver = facebook.getDriver();
//	}

	//public FbLogin facebook = new FbLogin(driver);
	

	
	@When("User is navigation to Facebook login page")
	public void user_is_navigation_to_facebook_login_page() {
		//facebook = new FbLogin(driver);
//		facebook.openBrowser();
		//driver = facebook.getDriver();
		driver.get("https://www.facebook.com/");
		driver.getTitle();
	}

	@And("Entering User Name")
	public void entering_user_name() {
	    facebook.enterUserName();
	    driver.getCurrentUrl();
	}

	@And("Entering Password")
	public void entering_password() {
	    facebook.enterPassword();
	}

	@Then("Clicking on Login button")
	public void clicking_on_login_button() {
	    facebook.clickLoginButton();
	}

	
}
