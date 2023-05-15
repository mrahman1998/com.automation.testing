package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginSteps {
	
	LoginPage login=new LoginPage();
	
	
	@When("accept all cookies")
	public void accept_all_cookies() {
		login.accept_all_cookies();
	}
	
	@And("select country")
	public void select_country() {
		login.select_country();
	}
	
	
	@And("age verification")
	public void age_ver() {
		login.age_ver();
	}

	@And("click sign in button")
	public void click_signInButton(){
		login.click_signInButton();
	}
	
	
	
	@And("enter valid email and password")
	public void enter_valid_email_and_password() {
	    login.enter_valid_email_and_password();
	}
	
	@And("click login")
	public void click_login() {
		login.click_login();
	}
	
	@Then("validate login")
	public void validate_login() {
	   login.validate_login();
	}
	
	@And("click on forget password")
	public void click_on_forget_password() {
	    login.click_on_forget_password();
	}

	@And("add email and click submit")
	public void email_and_click_submit() {
	   login.email_and_click_submit();
	}

	@Then("validate password recovery message")
	public void validate_password_recovery_message() {
	    login.validate_password_recovery_message();
	}
	
	
	
}
