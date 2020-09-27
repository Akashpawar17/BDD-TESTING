Feature: demo scenario outline for login
Scenario Outline: Successfull login with valid data
Given Application is opened
When I provide valid <email> and <password>
Then I should see logout button

Examples:
|email                | password|
|akash11.abd@gmail.com| aA@12345|
|akash11.abd@gmail.com| aA@12345|