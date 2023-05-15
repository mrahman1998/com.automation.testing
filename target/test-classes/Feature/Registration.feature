Feature: User registration
Background:
	When accept all cookies
	And age verification
	
@Task1
Scenario: Verify proper error when user try registration with age less than 18
	And click sign in button
	And click on I am new here
	And click on signup with email
	And fill registration form
	And click create your account
	Then validate registration
