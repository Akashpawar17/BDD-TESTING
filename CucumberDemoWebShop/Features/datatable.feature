Feature: Login with datatable
Scenario: successful login with valid credentials
Given user is on Demowebshoptricentis page
When  user signs in with valid email and valid password
|akash11.abd@gmail.com| aA@12345|
Then  user should see logout