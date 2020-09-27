Feature: Login
Scenario: successfull login 

Given user is on login page
When user enters username and password
And user clicks on login button
Then user goes to hotel booking form


Scenario: succesfull hotel booking
Given user is on hotel booking page
When  user enters firstname and lastname
And  user enters Email and MobileNo and address
And  user enters City and Sate and Number of guest
And  user enters Card Holder Name and Debit Card Number and cvv
And user enters Expiration month and Expiration Year
And user clicks on confirm booking button
Then  user will gets message booking completed