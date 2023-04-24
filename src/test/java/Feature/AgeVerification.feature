Feature: Age validation

@Smoke
Scenario: Verify user gets proper respose while age is below 18
When accept all cookies
And age below under eighteen
Then validate response
