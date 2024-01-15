Feature: Guru99
1)valid case
2)Invalid case
Scenario Outline: Testing login functionality valid and invalid data
Background:
Given I should go to login page
@PositiveTesting
Scenario: Checking the login functionality with valid data
When Enter username "<user>"
And  Enter password "<pass>"
Then  click on the submitbutton
Examples:
|user|pass|
|user|user|
|admin|admin|
@NegativeTesting
Scenario:Checking the login functionality with invalid data
When Enter username "user@#"
And  Enter password "Admin@!"
Then click on the submitbutton


