Feature: Loginto FaceBook

Scenario: Validate Invalid Login Credential of facebook

Given Launch browser
And Enter email address
And Enter Password
When Click Login
But Incorrect email & password error should display

