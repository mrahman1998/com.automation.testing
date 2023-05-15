Feature: Age validation popup

Background:	
	When accept all cookies

@Task
Scenario: Verify user gets proper error message while age is below eighteen	
	And select age below eighteen
	Then validate response
