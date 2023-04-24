Feature: User registration

@Smoke
Scenario: Verify registration works with all correct details

When accept all cookies
And age verification
And go to signin/register
And click on create new account
And enter valid user details
