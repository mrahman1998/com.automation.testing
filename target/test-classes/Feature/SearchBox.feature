Feature: Search box

@Smoke
Scenario: Validate search box

When accept all cookies
And age verification
And go to search and provide search text
And press enter
Then validate the response
