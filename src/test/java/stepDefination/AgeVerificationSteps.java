package stepDefination;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.AgeVerificationPage;

public class AgeVerificationSteps extends Base {
	
	AgeVerificationPage login = new AgeVerificationPage();
	
	@And ("age below under eighteen")
	public void age_below() {
	    login.age_below();
	}

	@Then("validate response")
	public void validate_response() throws InterruptedException {
	    login.validate_response();
	}

}
