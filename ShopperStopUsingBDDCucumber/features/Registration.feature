Feature: Registration Feature
Scenario: Positive Sign Up
Given user must be on home page
When user click on heart icon
And user click sign in with email
And user click sign up
And user enters all the credentials
And user enter continue
And user enter continue in OTP page 
Then User is on home page