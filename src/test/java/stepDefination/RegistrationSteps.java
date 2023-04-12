package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import page.RegistrationPage;

public class RegistrationSteps {
	
	RegistrationPage reg = new RegistrationPage();
	

	@When("go to signin\\/register")
	public void go_to_signin_register() {
	    reg.go_to_signin_register();
	}
	
	@And("click on create new account")
	public void create_new_account() {
	    reg.create_account();
	}

	
	@And("enter valid user details")
	public void enter_valid_user_details() {
	    reg.enter_valid_user_details();
	}
}
