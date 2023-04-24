Feature: Cart feature

@Smoke
Scenario: Verify cart when item is added

When accept all cookies
And age verification
And click on shop now button
And Add item to basket
Then Validate item is added to basket
