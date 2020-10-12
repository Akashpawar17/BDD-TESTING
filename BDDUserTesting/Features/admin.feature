Feature: admin register
Scenario: successfull register for admin with valid credentails
Given  admin is on register page
When admin enters personal details
And admin clicks on register button
Then Message  Displayed "Successfull registered for admin"

Scenario: Successful login with valid credentails
Given admin is on login page
And admin enters userId, userPassword
And admin clicks on login button
Then admin should be able to see logout button 