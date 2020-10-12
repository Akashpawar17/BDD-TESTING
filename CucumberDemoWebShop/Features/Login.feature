Feature: Check Login

Scenario: Successful login with valid credentials
Given user is on login page
When user enters valid username and password
And user clicks on login button
Then user should be able to see logout button 

@invalid
Scenario: Unsuccessful login with invalid credentails
Given user is on logindemo page
When user enters valid username and invalid password 
And user clicks on logindemo button
Then user should be able to display login was unsuccessful