Feature: Test Demo Guru page
1)Valid
2)Invalid
Background:
Given i should go to login page
@PositiveTesting
Scenario: check with valid data
When enter the username "<user>"
And enter the password "<pwd>"
And click on the submit button
Then i should see title as "<title>"
And click on sign off
Examples:
|user|pwd|title|
|Guru|deva|Login: Mercury Tours|
|user|user|Login: Mercury Tours|
@NegativeTesting
Scenario: check with invalid
When enter the username "<User>"
And enter the password "<pwd>"
And click on the submit button
Then i should see title as "<title>"
Examples:
|User|pwd|title|
|Guru|user|	Welcome: Mercury Tours|
