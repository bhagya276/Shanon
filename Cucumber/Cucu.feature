Feature: To verify login functionality
Scenario: To verify the user is able to login with valid UN & Pwd 
Given browser is open
And user is on login page
When user enters valid username & password
And click on login button
Then user should navigate to homepage
 