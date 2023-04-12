package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.SauceDemoLoginPage;

public class SauceDemoLoginDefination {
	
	
	SauceDemoLoginPage login = new SauceDemoLoginPage();
	
	@Given("Login to site url")
	public void login() {
		login.login_site_url();
	}
	
	@When("Enter username")
	public void enter_username() {
	    login.enter_username();
	}

	@And("Enter password")
	public void enter_password() {
	    login.enter_password();
	}

	@And("Click login button")
	public void click_login_btn() {
		login.login_btn_click();
	}
	
	@Then("User should be logged in")
	public void user_should_be_logged_in() {
	    login.validate_login();
	}

	
}
