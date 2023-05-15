Feature: Cart feature
Background:
	When accept all cookies
	And age verification
	And click sign in button
	And enter valid email and password
	And click login
	
@Task
Scenario: Verify successful add to cart from PLP page
	And check if basket empty and remove items if not empty
	And close basket
	And click on search button and enter the text
	And add any item to the basket
	Then validate item is added to basket

@Task
Scenario: Verify successful add to cart from PDP page
	And check if basket empty and remove items if not empty
	And close basket
	And click on search button and enter the text
	And select a item to open description
	And add selected item to basket
	And validate item is added to basket

