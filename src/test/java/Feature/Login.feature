Feature: Vuse site login validation

#Background: used to define common test step for all scenarios
Background:
	When accept all cookies
	And age verification
	
@Task1
Scenario: Login with correct username and password
	And click sign in button
	And enter valid email and password
	And click login
	Then validate login

@Task1	
Scenario: Verify proper message on password forget 
	And click sign in button
	And click on forget password
	And add email and click submit
	Then validate password recovery message
