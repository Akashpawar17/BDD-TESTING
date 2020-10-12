Feature: register 

Scenario: successful register with valid credentails
Given  user is on register page
When user enters personal details
And user clicks on register button
Then message displayed "Successful register"



Scenario: Successful login with valid credentails
Given user is on login page
And user enters userId, userPassword
And user clicks on login button
Then user should be able to see logout button 

