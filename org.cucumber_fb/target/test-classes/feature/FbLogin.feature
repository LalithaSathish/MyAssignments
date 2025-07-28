Feature: Loginto FaceBook

Background:
Given Launch browser

Scenario Outline: Validate Invalid Login Credential of facebook
Given Enter email address as <UserName>
And Enter Password as <Password>
When Click Login
But Incorrect email & password error should display

Examples:
   | UserName      | Password |
   | abc@gmail.com | abc      |
   | xyz@gmail.com | xyz   	  |	
