Feature: User registration

@Smoke
Scenario: Verify registration works with all correct details
Given user launch site url
When accept all cookies
And age verification
And go to signin/register
And click on create new account
And enter valid user details
And close the browser