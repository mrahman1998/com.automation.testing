package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.SearchBoxPage;

public class SearchBoxSteps {
	
	SearchBoxPage login = new  SearchBoxPage();
	
	@When("go to search and provide search text")
	public void go_to_search_and_provide_search_text() {
	    login.go_to_search_and_provide_search_text();
	}

	@When("press enter")
	public void press_enter() {
	    login.press_enter();
	}

	@Then("validate the response")
	public void validate_the_response() {
	    login.validate_the_response();
	}

}
