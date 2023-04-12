Feature: Vuse site login validation

#Background: used to define common test step for all scenarios

@Smoke
Scenario: Login with correct username and password
Given user launch site url
When accept all cookies
And age verification
And go to account
And go to signin or register
And enter valid email and password
And click login
Then validate login
And close the browser
