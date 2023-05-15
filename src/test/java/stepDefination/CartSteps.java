package stepDefination;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CartPage;

public class CartSteps extends Base{
	
	CartPage login = new CartPage();
	
	@And("check if basket empty and remove items if not empty")
	public void check_if_basket_empty_and_remove_items_if_not_empty() {
		login.check_if_basket_empty_and_remove_items_if_not_empty();
	}
	
	@And("close basket")
	public void close_basket() {
		login.close_basket();
	}
	
	@And("click on search button and enter the text")
	public void click_on_search_button_and_enter_the_text() {
	    login.click_on_search_button_and_enter_the_text();
	}

	@And("add any item to the basket")
	public void add_any_item_to_the_basket() {
	    login.add_any_item_to_the_basket();
	}

	@And("select a item to open description")
	public void select_a_item_to_open_description() {
	    login.select_a_item_to_open_description();
	}

	@And("add selected item to basket")
	public void add_selected_item_to_basket() {
	    login.add_selected_item_to_basket();
	}

	@Then("validate item is added to basket")
	public void validate_item_is_added_to_basket() {
	    login.validate_item_is_added_to_basket();
	}

}
