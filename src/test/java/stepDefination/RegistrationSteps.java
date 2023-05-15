package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.RegistrationPage;

public class RegistrationSteps {
	
	RegistrationPage reg = new RegistrationPage();
	

	@And("click on I am new here")
	public void click_on_no_i_am_new_here() {
	    reg.click_on_no_i_am_new_here();
	}

	@And("click on signup with email")
	public void click_on_signup_with_email() {
	    reg.click_on_signup_with_email();
	}

	@And("fill registration form")
	public void fill_registration_form() {
	    reg.fill_registration_form();
	}

	@And("click create your account")
	public void click_create_your_account() {
	    reg.click_create_your_account();
	}

	@Then("validate registration")
	public void validate_registration() {
	    reg.validate_registration();
	}

}
