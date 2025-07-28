Feature: Login to Saucedemo application

Scenario: Validate login credential with positive input
Given Launch Url
And Enter UserName
And Enter Password
When Click Login button
Then Redirect to homepage of Saucedemo application