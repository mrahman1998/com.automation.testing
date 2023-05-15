package stepDefination;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.AgeVerificationPage;

public class AgeVerificationSteps extends Base {
	
	AgeVerificationPage age = new AgeVerificationPage();
	
	@And ("select age below eighteen")
	public void age_below() {
	    age.age_below();
	}

	@Then("validate response")
	public void validate_response() throws InterruptedException {
	    age.validate_response();
	}

}
