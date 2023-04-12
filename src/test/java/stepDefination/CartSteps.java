package stepDefination;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CartPage;

public class CartSteps extends Base{
	
	CartPage login = new CartPage();
	
	@When("click on shop now button")
	public void click_on_shop_now_button() {
	    login.click_on_shop_now_button();
	}

	@When("Add item to basket")
	public void add_item_to_basket() {
	    login.add_item_to_basket();
	}

	@Then("Validate item is added to basket")
	public void validate_item_is_added_to_basket() {
	   login.validate_item_is_added_to_basket();
	}

}
