Feature: Search box
Background:
	When accept all cookies
	And age verification
	
@Smoke
Scenario: Validate search box
	And go to search and provide search text
	And press enter
	Then validate the response
