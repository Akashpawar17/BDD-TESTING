Feature: demo scenario outline for register
Scenario Outline: Successful register with valid credentials
Given Registartion page is opened
When I provide <Gender>
And  I provide valid <First name> and <Last name> and <Email>
And I provide valid <Password> and <ConfirmPassword>
Then I should able to see "Registration successfull"
Examples:
|Gender| First name|Last name |Email             | Password   |ConfirmPassword  |
|Male  |Akash      |Pawar     |akash77@gmail.com |qwerty      |qwerty           |
|Male  |mahesh     |kumar     |mahesh77@gmail.com|qwerty123   |qwerty123        |
