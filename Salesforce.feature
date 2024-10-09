Feature: New Account Creation in Salesforce page

Scenario: Create Account with valid data

Given Set the Salesforce environment
And Enter the salesforce username
And Enter the salesforce password
When clik on login button1
And Click on toggle button
And Click on Accounts tab
And Click on New Button
Given Enter your name
And Select Ownership as Public
When Click save button
Then Verify the Account name






