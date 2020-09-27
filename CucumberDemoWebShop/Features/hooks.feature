Feature: Signin

Scenario: Test demowebshop with valid credentials
Given  User has navigated to login page
When  user prvides user name and password
Then  user signin successfully

Scenario: Test Demwebshop with invalid data
Given application is opened
When i provide valid username and invalid password
Then  i should view a error message