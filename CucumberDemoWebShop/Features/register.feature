Feature: Register
Scenario: Successful register
Given user is on the register page
When user selects gender
And user enters First name, Last name
And user enters Email, Password
And user enters Confirm password
And user clicks Register button
Then message displayed registration successfully