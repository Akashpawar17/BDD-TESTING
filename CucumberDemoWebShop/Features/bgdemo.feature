Feature: check title
Background: This is the demo
Given  I am on the homepage og demowebshop

Scenario: check the title of demowebshop.tricentis
Then I should see that title contains demowebshop
Scenario: Check the source of demowebshop.tricentis
Then I should see that source contains demowebshop